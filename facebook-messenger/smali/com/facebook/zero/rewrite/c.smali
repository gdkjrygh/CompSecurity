.class public Lcom/facebook/zero/rewrite/c;
.super Ljava/lang/Object;
.source "ZeroAwareIntentWrapper.java"

# interfaces
.implements Lcom/facebook/c/o;


# instance fields
.field private final a:Lcom/facebook/zero/rewrite/f;


# direct methods
.method public constructor <init>(Lcom/facebook/zero/rewrite/f;)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/facebook/zero/rewrite/c;->a:Lcom/facebook/zero/rewrite/f;

    .line 19
    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;)Landroid/net/Uri;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/facebook/zero/rewrite/c;->a:Lcom/facebook/zero/rewrite/f;

    invoke-virtual {v0, p1}, Lcom/facebook/zero/rewrite/f;->a(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method
