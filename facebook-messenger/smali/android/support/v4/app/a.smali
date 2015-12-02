.class Landroid/support/v4/app/a;
.super Ljava/lang/Object;
.source "ActivityCompatHoneycomb.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 29
    invoke-virtual {p0}, Landroid/app/Activity;->invalidateOptionsMenu()V

    .line 30
    return-void
.end method
