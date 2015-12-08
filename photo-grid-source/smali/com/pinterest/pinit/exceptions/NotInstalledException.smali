.class public Lcom/pinterest/pinit/exceptions/NotInstalledException;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# static fields
.field public static final MESSAGE:Ljava/lang/String; = "Pinterest for Android is not installed!"


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 13
    const-string v0, "Pinterest for Android is not installed!"

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 14
    return-void
.end method
