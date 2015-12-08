.class final Lcom/arist/view/f;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/arist/view/e;


# direct methods
.method constructor <init>(Lcom/arist/view/e;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/view/f;->a:Lcom/arist/view/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    sget-object v0, Lcom/arist/activity/MyApplication;->d:Lcom/arist/activity/MyApplication;

    invoke-virtual {v0}, Lcom/arist/activity/MyApplication;->h()V

    return-void
.end method
