.class public final Lcom/facebook/prefs/shared/z;
.super Lcom/facebook/inject/d;
.source "FbSharedPropertyDbSchemaPartAutoProvider.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/prefs/shared/y;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/prefs/shared/y;
    .locals 1

    .prologue
    .line 13
    new-instance v0, Lcom/facebook/prefs/shared/y;

    invoke-direct {v0}, Lcom/facebook/prefs/shared/y;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 8
    invoke-virtual {p0}, Lcom/facebook/prefs/shared/z;->a()Lcom/facebook/prefs/shared/y;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 18
    instance-of v0, p1, Lcom/facebook/prefs/shared/z;

    return v0
.end method
