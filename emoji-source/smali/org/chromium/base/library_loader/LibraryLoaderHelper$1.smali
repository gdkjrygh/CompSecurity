.class final Lorg/chromium/base/library_loader/LibraryLoaderHelper$1;
.super Ljava/lang/Thread;
.source "LibraryLoaderHelper.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/base/library_loader/LibraryLoaderHelper;->deleteWorkaroundLibrariesAsynchronously(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$context:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 211
    iput-object p1, p0, Lorg/chromium/base/library_loader/LibraryLoaderHelper$1;->val$context:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 214
    iget-object v0, p0, Lorg/chromium/base/library_loader/LibraryLoaderHelper$1;->val$context:Landroid/content/Context;

    invoke-static {v0}, Lorg/chromium/base/library_loader/LibraryLoaderHelper;->deleteWorkaroundLibrariesSynchronously(Landroid/content/Context;)V

    .line 215
    return-void
.end method
