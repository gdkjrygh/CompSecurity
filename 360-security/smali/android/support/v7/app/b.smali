.class Landroid/support/v7/app/b;
.super Landroid/support/v7/app/g;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/app/b$a;
    }
.end annotation


# direct methods
.method constructor <init>(Landroid/support/v7/app/ActionBarActivity;)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0, p1}, Landroid/support/v7/app/g;-><init>(Landroid/support/v7/app/ActionBarActivity;)V

    .line 25
    return-void
.end method


# virtual methods
.method a(Landroid/view/Window$Callback;)Landroid/view/Window$Callback;
    .locals 1

    .prologue
    .line 29
    new-instance v0, Landroid/support/v7/app/b$a;

    invoke-direct {v0, p0, p1}, Landroid/support/v7/app/b$a;-><init>(Landroid/support/v7/app/b;Landroid/view/Window$Callback;)V

    return-object v0
.end method
