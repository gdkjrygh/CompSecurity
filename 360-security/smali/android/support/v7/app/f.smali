.class Landroid/support/v7/app/f;
.super Landroid/support/v7/app/e;
.source "360Security"


# direct methods
.method constructor <init>(Landroid/support/v7/app/ActionBarActivity;)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0, p1}, Landroid/support/v7/app/e;-><init>(Landroid/support/v7/app/ActionBarActivity;)V

    .line 28
    return-void
.end method


# virtual methods
.method public a()Landroid/support/v7/app/ActionBar;
    .locals 3

    .prologue
    .line 32
    new-instance v0, Landroid/support/v7/app/k;

    iget-object v1, p0, Landroid/support/v7/app/f;->a:Landroid/support/v7/app/ActionBarActivity;

    iget-object v2, p0, Landroid/support/v7/app/f;->a:Landroid/support/v7/app/ActionBarActivity;

    invoke-direct {v0, v1, v2}, Landroid/support/v7/app/k;-><init>(Landroid/app/Activity;Landroid/support/v7/app/ActionBar$a;)V

    return-object v0
.end method

.method a(Landroid/content/Context;Landroid/view/ActionMode;)Landroid/support/v7/internal/view/ActionModeWrapper;
    .locals 1

    .prologue
    .line 43
    new-instance v0, Landroid/support/v7/internal/view/ActionModeWrapperJB;

    invoke-direct {v0, p1, p2}, Landroid/support/v7/internal/view/ActionModeWrapperJB;-><init>(Landroid/content/Context;Landroid/view/ActionMode;)V

    return-object v0
.end method
