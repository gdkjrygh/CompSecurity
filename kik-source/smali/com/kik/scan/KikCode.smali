.class public abstract Lcom/kik/scan/KikCode;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/scan/KikCode$Colour;,
        Lcom/kik/scan/KikCode$Types;
    }
.end annotation


# static fields
.field protected static _isLoaded:Z


# instance fields
.field private _colour:I

.field private _type:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x3

    const/4 v3, 0x1

    const/4 v0, 0x0

    .line 4
    sput-boolean v0, Lcom/kik/scan/KikCode;->_isLoaded:Z

    .line 7
    new-array v1, v4, [Ljava/lang/String;

    const-string v2, "kikcode_encode"

    aput-object v2, v1, v0

    const-string v2, "libkikcode_encode"

    aput-object v2, v1, v3

    const/4 v2, 0x2

    const-string v3, "libkikcode_encode.so"

    aput-object v3, v1, v2

    .line 9
    :goto_0
    if-ge v0, v4, :cond_0

    .line 11
    :try_start_0
    aget-object v2, v1, v0

    invoke-static {v2}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 13
    const/4 v2, 0x1

    sput-boolean v2, Lcom/kik/scan/KikCode;->_isLoaded:Z
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    :cond_0
    sget-boolean v0, Lcom/kik/scan/KikCode;->_isLoaded:Z

    if-nez v0, :cond_1

    .line 24
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "user.dir"

    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/build/libkikcode_encode.so"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/System;->load(Ljava/lang/String;)V

    .line 26
    const/4 v0, 0x1

    sput-boolean v0, Lcom/kik/scan/KikCode;->_isLoaded:Z
    :try_end_1
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_1 .. :try_end_1} :catch_1

    .line 32
    :cond_1
    :goto_1
    return-void

    .line 9
    :catch_0
    move-exception v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1
.end method

.method public constructor <init>(II)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput p1, p0, Lcom/kik/scan/KikCode;->_type:I

    .line 50
    iput p2, p0, Lcom/kik/scan/KikCode;->_colour:I

    .line 51
    return-void
.end method

.method public static parse([B)Lcom/kik/scan/KikCode;
    .locals 1

    .prologue
    .line 90
    sget-boolean v0, Lcom/kik/scan/KikCode;->_isLoaded:Z

    if-nez v0, :cond_0

    .line 91
    const/4 v0, 0x0

    .line 94
    :goto_0
    return-object v0

    :cond_0
    invoke-static {p0}, Lcom/kik/scan/KikCode;->parseInternal([B)Lcom/kik/scan/KikCode;

    move-result-object v0

    goto :goto_0
.end method

.method protected static native parseInternal([B)Lcom/kik/scan/KikCode;
.end method


# virtual methods
.method public abstract encode()[B
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 70
    instance-of v1, p1, Lcom/kik/scan/KikCode;

    if-nez v1, :cond_1

    .line 83
    :cond_0
    :goto_0
    return v0

    .line 74
    :cond_1
    check-cast p1, Lcom/kik/scan/KikCode;

    .line 76
    iget v1, p0, Lcom/kik/scan/KikCode;->_colour:I

    iget v2, p1, Lcom/kik/scan/KikCode;->_colour:I

    if-ne v1, v2, :cond_0

    .line 79
    iget v1, p0, Lcom/kik/scan/KikCode;->_type:I

    iget v2, p1, Lcom/kik/scan/KikCode;->_type:I

    if-ne v1, v2, :cond_0

    .line 83
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public getColour()I
    .locals 1

    .prologue
    .line 55
    iget v0, p0, Lcom/kik/scan/KikCode;->_colour:I

    return v0
.end method

.method public getType()I
    .locals 1

    .prologue
    .line 60
    iget v0, p0, Lcom/kik/scan/KikCode;->_type:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 65
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "type="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/kik/scan/KikCode;->_type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", colour="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/kik/scan/KikCode;->_colour:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
