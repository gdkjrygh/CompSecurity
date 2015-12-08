.class public Lcom/pinterest/pinit/exceptions/SourceUrlException;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# static fields
.field public static final MESSAGE:Ljava/lang/String; = "url cannot be null! Did you call setUrl?"


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 13
    const-string v0, "url cannot be null! Did you call setUrl?"

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 14
    return-void
.end method
