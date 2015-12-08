.class Landroid/support/v7/app/ActionBarActivityDelegateHC;
.super Landroid/support/v7/app/ActionBarActivityDelegateBase;
.source "ActionBarActivityDelegateHC.java"


# direct methods
.method constructor <init>(Landroid/support/v7/app/ActionBarActivity;)V
    .locals 0
    .param p1, "activity"    # Landroid/support/v7/app/ActionBarActivity;

    .prologue
    .line 22
    invoke-direct {p0, p1}, Landroid/support/v7/app/ActionBarActivityDelegateBase;-><init>(Landroid/support/v7/app/ActionBarActivity;)V

    .line 23
    return-void
.end method


# virtual methods
.method public createSupportActionBar()Landroid/support/v7/app/ActionBar;
    .locals 3

    .prologue
    .line 27
    invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivityDelegateHC;->ensureSubDecor()V

    .line 28
    new-instance v0, Landroid/support/v7/app/ActionBarImplHC;

    iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateHC;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateHC;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-direct {v0, v1, v2}, Landroid/support/v7/app/ActionBarImplHC;-><init>(Landroid/support/v7/app/ActionBarActivity;Landroid/support/v7/app/ActionBar$Callback;)V

    return-object v0
.end method
