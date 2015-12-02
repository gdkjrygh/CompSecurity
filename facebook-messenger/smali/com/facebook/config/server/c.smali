.class Lcom/facebook/config/server/c;
.super Ljava/lang/Object;
.source "DefaultServerConfig.java"

# interfaces
.implements Lcom/facebook/prefs/shared/f;


# instance fields
.field final synthetic a:Lcom/facebook/config/server/b;


# direct methods
.method constructor <init>(Lcom/facebook/config/server/b;)V
    .locals 0

    .prologue
    .line 68
    iput-object p1, p0, Lcom/facebook/config/server/c;->a:Lcom/facebook/config/server/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/prefs/shared/d;Lcom/facebook/prefs/shared/ae;)V
    .locals 1

    .prologue
    .line 73
    iget-object v0, p0, Lcom/facebook/config/server/c;->a:Lcom/facebook/config/server/b;

    invoke-static {v0, p2}, Lcom/facebook/config/server/b;->a(Lcom/facebook/config/server/b;Lcom/facebook/prefs/shared/ae;)V

    .line 74
    return-void
.end method
