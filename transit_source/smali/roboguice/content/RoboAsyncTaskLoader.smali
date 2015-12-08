.class public abstract Lroboguice/content/RoboAsyncTaskLoader;
.super Landroid/support/v4/content/AsyncTaskLoader;
.source "RoboAsyncTaskLoader.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<D:",
        "Ljava/lang/Object;",
        ">",
        "Landroid/support/v4/content/AsyncTaskLoader",
        "<TD;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 15
    .local p0, "this":Lroboguice/content/RoboAsyncTaskLoader;, "Lroboguice/content/RoboAsyncTaskLoader<TD;>;"
    invoke-direct {p0, p1}, Landroid/support/v4/content/AsyncTaskLoader;-><init>(Landroid/content/Context;)V

    .line 16
    invoke-static {p1, p0}, Lroboguice/RoboGuice;->injectMembers(Landroid/content/Context;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    return-void
.end method
