.class Lcom/facebook/http/c/b;
.super Ljava/lang/Object;
.source "DefaultNetworkConfig.java"

# interfaces
.implements Lcom/facebook/prefs/shared/f;


# instance fields
.field final synthetic a:Lcom/facebook/http/c/a;


# direct methods
.method constructor <init>(Lcom/facebook/http/c/a;)V
    .locals 0

    .prologue
    .line 38
    iput-object p1, p0, Lcom/facebook/http/c/b;->a:Lcom/facebook/http/c/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/prefs/shared/d;Lcom/facebook/prefs/shared/ae;)V
    .locals 1

    .prologue
    .line 42
    sget-object v0, Lcom/facebook/http/f/c;->f:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v0, p2}, Lcom/facebook/prefs/shared/ae;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/facebook/http/f/c;->g:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v0, p2}, Lcom/facebook/prefs/shared/ae;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 44
    :cond_0
    iget-object v0, p0, Lcom/facebook/http/c/b;->a:Lcom/facebook/http/c/a;

    invoke-static {v0}, Lcom/facebook/http/c/a;->a(Lcom/facebook/http/c/a;)V

    .line 46
    :cond_1
    return-void
.end method
