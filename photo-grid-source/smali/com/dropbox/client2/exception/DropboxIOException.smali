.class public Lcom/dropbox/client2/exception/DropboxIOException;
.super Lcom/dropbox/client2/exception/DropboxException;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0x2L


# direct methods
.method public constructor <init>(Ljava/io/IOException;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0, p1}, Lcom/dropbox/client2/exception/DropboxException;-><init>(Ljava/lang/Throwable;)V

    .line 37
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0, p1}, Lcom/dropbox/client2/exception/DropboxException;-><init>(Ljava/lang/String;)V

    .line 41
    return-void
.end method
