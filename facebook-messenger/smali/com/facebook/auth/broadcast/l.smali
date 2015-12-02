.class public Lcom/facebook/auth/broadcast/l;
.super Ljava/lang/Object;
.source "SsoLoginBroadcaster.java"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/facebook/base/j;

.field private final c:Lcom/facebook/config/a/d;

.field private final d:Lcom/facebook/c/l;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/base/j;Lcom/facebook/config/a/d;Lcom/facebook/c/l;)V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/facebook/auth/broadcast/l;->a:Landroid/content/Context;

    .line 41
    iput-object p2, p0, Lcom/facebook/auth/broadcast/l;->b:Lcom/facebook/base/j;

    .line 42
    iput-object p3, p0, Lcom/facebook/auth/broadcast/l;->c:Lcom/facebook/config/a/d;

    .line 43
    iput-object p4, p0, Lcom/facebook/auth/broadcast/l;->d:Lcom/facebook/c/l;

    .line 44
    return-void
.end method
