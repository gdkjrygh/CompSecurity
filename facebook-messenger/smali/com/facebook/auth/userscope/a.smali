.class public Lcom/facebook/auth/userscope/a;
.super Ljava/lang/Object;
.source "EmptyViewerContextManager.java"

# interfaces
.implements Lcom/facebook/auth/viewercontext/e;


# static fields
.field private static final a:Lcom/facebook/auth/viewercontext/ViewerContext;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 16
    invoke-static {}, Lcom/facebook/auth/viewercontext/ViewerContext;->newBuilder()Lcom/facebook/auth/viewercontext/c;

    move-result-object v0

    const-string v1, "0"

    invoke-virtual {v0, v1}, Lcom/facebook/auth/viewercontext/c;->a(Ljava/lang/String;)Lcom/facebook/auth/viewercontext/c;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/facebook/auth/viewercontext/c;->b(Ljava/lang/String;)Lcom/facebook/auth/viewercontext/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/auth/viewercontext/c;->h()Lcom/facebook/auth/viewercontext/ViewerContext;

    move-result-object v0

    sput-object v0, Lcom/facebook/auth/userscope/a;->a:Lcom/facebook/auth/viewercontext/ViewerContext;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/auth/viewercontext/ViewerContext;
    .locals 1

    .prologue
    .line 28
    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Lcom/facebook/auth/viewercontext/ViewerContext;)V
    .locals 0

    .prologue
    .line 39
    return-void
.end method

.method public b()Lcom/facebook/auth/viewercontext/ViewerContext;
    .locals 1

    .prologue
    .line 33
    sget-object v0, Lcom/facebook/auth/userscope/a;->a:Lcom/facebook/auth/viewercontext/ViewerContext;

    return-object v0
.end method

.method public b(Lcom/facebook/auth/viewercontext/ViewerContext;)V
    .locals 0

    .prologue
    .line 49
    return-void
.end method

.method public c()Lcom/facebook/auth/viewercontext/ViewerContext;
    .locals 1

    .prologue
    .line 43
    sget-object v0, Lcom/facebook/auth/userscope/a;->a:Lcom/facebook/auth/viewercontext/ViewerContext;

    return-object v0
.end method

.method public d()V
    .locals 0

    .prologue
    .line 54
    return-void
.end method
