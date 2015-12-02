.class Lcom/facebook/selfupdate/t;
.super Ljava/lang/Object;
.source "SelfUpdateManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:J

.field final synthetic b:Lcom/facebook/selfupdate/s;


# direct methods
.method constructor <init>(Lcom/facebook/selfupdate/s;J)V
    .locals 0

    .prologue
    .line 199
    iput-object p1, p0, Lcom/facebook/selfupdate/t;->b:Lcom/facebook/selfupdate/s;

    iput-wide p2, p0, Lcom/facebook/selfupdate/t;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 202
    iget-object v0, p0, Lcom/facebook/selfupdate/t;->b:Lcom/facebook/selfupdate/s;

    iget-object v0, v0, Lcom/facebook/selfupdate/s;->a:Lcom/facebook/selfupdate/q;

    iget-wide v1, p0, Lcom/facebook/selfupdate/t;->a:J

    invoke-static {v0, v1, v2}, Lcom/facebook/selfupdate/q;->a(Lcom/facebook/selfupdate/q;J)V

    .line 203
    return-void
.end method
