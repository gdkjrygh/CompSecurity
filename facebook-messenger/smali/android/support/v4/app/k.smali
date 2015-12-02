.class Landroid/support/v4/app/k;
.super Ljava/lang/Object;
.source "FragmentActivity.java"

# interfaces
.implements Landroid/support/v4/app/o;


# instance fields
.field final synthetic a:Landroid/support/v4/app/i;


# direct methods
.method constructor <init>(Landroid/support/v4/app/i;)V
    .locals 0

    .prologue
    .line 102
    iput-object p1, p0, Landroid/support/v4/app/k;->a:Landroid/support/v4/app/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)Landroid/view/View;
    .locals 1

    .prologue
    .line 105
    iget-object v0, p0, Landroid/support/v4/app/k;->a:Landroid/support/v4/app/i;

    invoke-virtual {v0, p1}, Landroid/support/v4/app/i;->findViewById(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method
