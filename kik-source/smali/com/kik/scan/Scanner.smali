.class public Lcom/kik/scan/Scanner;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/scan/Scanner$ScanResult;
    }
.end annotation


# static fields
.field protected static _isLoaded:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x3

    const/4 v3, 0x1

    const/4 v0, 0x0

    .line 4
    sput-boolean v0, Lcom/kik/scan/Scanner;->_isLoaded:Z

    .line 7
    new-array v1, v4, [Ljava/lang/String;

    const-string v2, "kikcode_scan"

    aput-object v2, v1, v0

    const-string v2, "libkikcode_scan"

    aput-object v2, v1, v3

    const/4 v2, 0x2

    const-string v3, "libkikcode_scan.so"

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

    sput-boolean v2, Lcom/kik/scan/Scanner;->_isLoaded:Z
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    :cond_0
    sget-boolean v0, Lcom/kik/scan/Scanner;->_isLoaded:Z

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

    const-string v1, "/build/libkikcode_scan.so"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/System;->load(Ljava/lang/String;)V

    .line 26
    const/4 v0, 0x1

    sput-boolean v0, Lcom/kik/scan/Scanner;->_isLoaded:Z
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

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    return-void
.end method

.method public static scan([BIII)Lcom/kik/scan/Scanner$ScanResult;
    .locals 2

    .prologue
    .line 47
    sget-boolean v0, Lcom/kik/scan/Scanner;->_isLoaded:Z

    if-nez v0, :cond_0

    .line 48
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Scan library not loaded"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 51
    :cond_0
    invoke-static {p0, p1, p2, p3}, Lcom/kik/scan/Scanner;->scanInternal([BIII)Lcom/kik/scan/Scanner$ScanResult;

    move-result-object v0

    return-object v0
.end method

.method protected static native scanInternal([BIII)Lcom/kik/scan/Scanner$ScanResult;
.end method
