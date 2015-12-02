.class Landroid/support/v4/app/t;
.super Ljava/lang/Object;
.source "FragmentManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/support/v4/app/s;


# direct methods
.method constructor <init>(Landroid/support/v4/app/s;)V
    .locals 0

    .prologue
    .line 432
    iput-object p1, p0, Landroid/support/v4/app/t;->a:Landroid/support/v4/app/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 435
    iget-object v0, p0, Landroid/support/v4/app/t;->a:Landroid/support/v4/app/s;

    invoke-virtual {v0}, Landroid/support/v4/app/s;->h()Z

    .line 436
    return-void
.end method
