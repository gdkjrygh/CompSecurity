.class Landroid/support/v4/app/v;
.super Ljava/lang/Object;
.source "FragmentManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:I

.field final synthetic c:Landroid/support/v4/app/s;


# direct methods
.method constructor <init>(Landroid/support/v4/app/s;Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 527
    iput-object p1, p0, Landroid/support/v4/app/v;->c:Landroid/support/v4/app/s;

    iput-object p2, p0, Landroid/support/v4/app/v;->a:Ljava/lang/String;

    iput p3, p0, Landroid/support/v4/app/v;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 529
    iget-object v0, p0, Landroid/support/v4/app/v;->c:Landroid/support/v4/app/s;

    iget-object v1, p0, Landroid/support/v4/app/v;->c:Landroid/support/v4/app/s;

    iget-object v1, v1, Landroid/support/v4/app/s;->o:Landroid/support/v4/app/p;

    invoke-virtual {v1}, Landroid/support/v4/app/p;->b()Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Landroid/support/v4/app/v;->a:Ljava/lang/String;

    const/4 v3, -0x1

    iget v4, p0, Landroid/support/v4/app/v;->b:I

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/support/v4/app/s;->a(Landroid/os/Handler;Ljava/lang/String;II)Z

    .line 530
    return-void
.end method
