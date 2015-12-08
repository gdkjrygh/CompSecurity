.class public final Lcom/dropbox/client2/session/Session$ProxyInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final host:Ljava/lang/String;

.field public final port:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 162
    const/4 v0, -0x1

    invoke-direct {p0, p1, v0}, Lcom/dropbox/client2/session/Session$ProxyInfo;-><init>(Ljava/lang/String;I)V

    .line 163
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 151
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 152
    iput-object p1, p0, Lcom/dropbox/client2/session/Session$ProxyInfo;->host:Ljava/lang/String;

    .line 153
    iput p2, p0, Lcom/dropbox/client2/session/Session$ProxyInfo;->port:I

    .line 154
    return-void
.end method
