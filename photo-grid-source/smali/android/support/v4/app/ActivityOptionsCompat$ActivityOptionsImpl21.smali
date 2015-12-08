.class Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImpl21;
.super Landroid/support/v4/app/ActivityOptionsCompat;
.source "SourceFile"


# instance fields
.field private final mImpl:Landroid/support/v4/app/ActivityOptionsCompat21;


# direct methods
.method constructor <init>(Landroid/support/v4/app/ActivityOptionsCompat21;)V
    .locals 0

    .prologue
    .line 201
    invoke-direct {p0}, Landroid/support/v4/app/ActivityOptionsCompat;-><init>()V

    .line 202
    iput-object p1, p0, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImpl21;->mImpl:Landroid/support/v4/app/ActivityOptionsCompat21;

    .line 203
    return-void
.end method


# virtual methods
.method public toBundle()Landroid/os/Bundle;
    .locals 1

    .prologue
    .line 207
    iget-object v0, p0, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImpl21;->mImpl:Landroid/support/v4/app/ActivityOptionsCompat21;

    invoke-virtual {v0}, Landroid/support/v4/app/ActivityOptionsCompat21;->toBundle()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public update(Landroid/support/v4/app/ActivityOptionsCompat;)V
    .locals 2

    .prologue
    .line 212
    instance-of v0, p1, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImpl21;

    if-eqz v0, :cond_0

    .line 214
    check-cast p1, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImpl21;

    .line 215
    iget-object v0, p0, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImpl21;->mImpl:Landroid/support/v4/app/ActivityOptionsCompat21;

    iget-object v1, p1, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImpl21;->mImpl:Landroid/support/v4/app/ActivityOptionsCompat21;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/ActivityOptionsCompat21;->update(Landroid/support/v4/app/ActivityOptionsCompat21;)V

    .line 217
    :cond_0
    return-void
.end method
