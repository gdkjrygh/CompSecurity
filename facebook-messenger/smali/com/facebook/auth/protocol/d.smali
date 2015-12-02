.class public Lcom/facebook/auth/protocol/d;
.super Ljava/lang/Object;
.source "AuthenticateMethod.java"


# instance fields
.field private final a:Lcom/facebook/auth/credentials/PasswordCredentials;

.field private final b:Ljava/lang/String;

.field private final c:Z


# direct methods
.method public constructor <init>(Lcom/facebook/auth/credentials/PasswordCredentials;Ljava/lang/String;Z)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/facebook/auth/protocol/d;->a:Lcom/facebook/auth/credentials/PasswordCredentials;

    .line 38
    iput-object p2, p0, Lcom/facebook/auth/protocol/d;->b:Ljava/lang/String;

    .line 39
    iput-boolean p3, p0, Lcom/facebook/auth/protocol/d;->c:Z

    .line 40
    return-void
.end method

.method static synthetic a(Lcom/facebook/auth/protocol/d;)Lcom/facebook/auth/credentials/PasswordCredentials;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/facebook/auth/protocol/d;->a:Lcom/facebook/auth/credentials/PasswordCredentials;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/auth/protocol/d;)Z
    .locals 1

    .prologue
    .line 27
    iget-boolean v0, p0, Lcom/facebook/auth/protocol/d;->c:Z

    return v0
.end method

.method static synthetic c(Lcom/facebook/auth/protocol/d;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/facebook/auth/protocol/d;->b:Ljava/lang/String;

    return-object v0
.end method
