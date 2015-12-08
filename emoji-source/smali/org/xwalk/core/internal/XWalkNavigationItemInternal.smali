.class public Lorg/xwalk/core/internal/XWalkNavigationItemInternal;
.super Ljava/lang/Object;
.source "XWalkNavigationItemInternal.java"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation build Lorg/xwalk/core/internal/XWalkAPI;
    createInternally = true
.end annotation


# instance fields
.field private mEntry:Lorg/chromium/content_public/browser/NavigationEntry;


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkNavigationItemInternal;->mEntry:Lorg/chromium/content_public/browser/NavigationEntry;

    .line 20
    return-void
.end method

.method constructor <init>(Lorg/chromium/content_public/browser/NavigationEntry;)V
    .locals 0
    .param p1, "entry"    # Lorg/chromium/content_public/browser/NavigationEntry;

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkNavigationItemInternal;->mEntry:Lorg/chromium/content_public/browser/NavigationEntry;

    .line 24
    return-void
.end method

.method constructor <init>(Lorg/xwalk/core/internal/XWalkNavigationItemInternal;)V
    .locals 1
    .param p1, "item"    # Lorg/xwalk/core/internal/XWalkNavigationItemInternal;

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iget-object v0, p1, Lorg/xwalk/core/internal/XWalkNavigationItemInternal;->mEntry:Lorg/chromium/content_public/browser/NavigationEntry;

    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkNavigationItemInternal;->mEntry:Lorg/chromium/content_public/browser/NavigationEntry;

    .line 28
    return-void
.end method


# virtual methods
.method protected bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .prologue
    .line 12
    invoke-virtual {p0}, Lorg/xwalk/core/internal/XWalkNavigationItemInternal;->clone()Lorg/xwalk/core/internal/XWalkNavigationItemInternal;

    move-result-object v0

    return-object v0
.end method

.method protected declared-synchronized clone()Lorg/xwalk/core/internal/XWalkNavigationItemInternal;
    .locals 1

    .prologue
    .line 61
    monitor-enter p0

    :try_start_0
    new-instance v0, Lorg/xwalk/core/internal/XWalkNavigationItemInternal;

    invoke-direct {v0, p0}, Lorg/xwalk/core/internal/XWalkNavigationItemInternal;-><init>(Lorg/xwalk/core/internal/XWalkNavigationItemInternal;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public getOriginalUrl()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation

    .prologue
    .line 47
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkNavigationItemInternal;->mEntry:Lorg/chromium/content_public/browser/NavigationEntry;

    invoke-virtual {v0}, Lorg/chromium/content_public/browser/NavigationEntry;->getOriginalUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation

    .prologue
    .line 57
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkNavigationItemInternal;->mEntry:Lorg/chromium/content_public/browser/NavigationEntry;

    invoke-virtual {v0}, Lorg/chromium/content_public/browser/NavigationEntry;->getTitle()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation

    .prologue
    .line 37
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkNavigationItemInternal;->mEntry:Lorg/chromium/content_public/browser/NavigationEntry;

    invoke-virtual {v0}, Lorg/chromium/content_public/browser/NavigationEntry;->getUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
