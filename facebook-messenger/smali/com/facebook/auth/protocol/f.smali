.class public Lcom/facebook/auth/protocol/f;
.super Ljava/lang/Object;
.source "AuthenticateSsoMethod.java"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/facebook/auth/protocol/f;->a:Ljava/lang/String;

    .line 38
    iput-object p2, p0, Lcom/facebook/auth/protocol/f;->b:Ljava/lang/String;

    .line 39
    iput-boolean p3, p0, Lcom/facebook/auth/protocol/f;->c:Z

    .line 40
    return-void
.end method

.method static synthetic a(Lcom/facebook/auth/protocol/f;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/facebook/auth/protocol/f;->a:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/auth/protocol/f;)Z
    .locals 1

    .prologue
    .line 27
    iget-boolean v0, p0, Lcom/facebook/auth/protocol/f;->c:Z

    return v0
.end method

.method static synthetic c(Lcom/facebook/auth/protocol/f;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/facebook/auth/protocol/f;->b:Ljava/lang/String;

    return-object v0
.end method
