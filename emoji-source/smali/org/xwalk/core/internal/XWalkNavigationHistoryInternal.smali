.class public Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;
.super Ljava/lang/Object;
.source "XWalkNavigationHistoryInternal.java"

# interfaces
.implements Ljava/lang/Cloneable;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal$1;,
        Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal$DirectionInternal;
    }
.end annotation

.annotation build Lorg/xwalk/core/internal/XWalkAPI;
    createInternally = true
.end annotation


# instance fields
.field private mHistory:Lorg/chromium/content_public/browser/NavigationHistory;

.field private mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    .line 24
    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->mHistory:Lorg/chromium/content_public/browser/NavigationHistory;

    .line 25
    return-void
.end method

.method constructor <init>(Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;)V
    .locals 1
    .param p1, "history"    # Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iget-object v0, p1, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    .line 34
    iget-object v0, p1, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->mHistory:Lorg/chromium/content_public/browser/NavigationHistory;

    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->mHistory:Lorg/chromium/content_public/browser/NavigationHistory;

    .line 35
    return-void
.end method

.method constructor <init>(Lorg/xwalk/core/internal/XWalkViewInternal;Lorg/chromium/content_public/browser/NavigationHistory;)V
    .locals 0
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;
    .param p2, "history"    # Lorg/chromium/content_public/browser/NavigationHistory;

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    .line 29
    iput-object p2, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->mHistory:Lorg/chromium/content_public/browser/NavigationHistory;

    .line 30
    return-void
.end method


# virtual methods
.method public canGoBack()Z
    .locals 1
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation

    .prologue
    .line 87
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v0}, Lorg/xwalk/core/internal/XWalkViewInternal;->canGoBack()Z

    move-result v0

    return v0
.end method

.method public canGoForward()Z
    .locals 1
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation

    .prologue
    .line 97
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v0}, Lorg/xwalk/core/internal/XWalkViewInternal;->canGoForward()Z

    move-result v0

    return v0
.end method

.method public clear()V
    .locals 1
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation

    .prologue
    .line 149
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v0}, Lorg/xwalk/core/internal/XWalkViewInternal;->clearHistory()V

    .line 150
    return-void
.end method

.method protected bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .prologue
    .line 15
    invoke-virtual {p0}, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->clone()Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;

    move-result-object v0

    return-object v0
.end method

.method protected declared-synchronized clone()Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;
    .locals 1

    .prologue
    .line 153
    monitor-enter p0

    :try_start_0
    new-instance v0, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;

    invoke-direct {v0, p0}, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;-><init>(Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public getCurrentIndex()I
    .locals 1
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation

    .prologue
    .line 140
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->mHistory:Lorg/chromium/content_public/browser/NavigationHistory;

    invoke-virtual {v0}, Lorg/chromium/content_public/browser/NavigationHistory;->getCurrentEntryIndex()I

    move-result v0

    return v0
.end method

.method public getCurrentItem()Lorg/xwalk/core/internal/XWalkNavigationItemInternal;
    .locals 1
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation

    .prologue
    .line 77
    invoke-virtual {p0}, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->getCurrentIndex()I

    move-result v0

    invoke-virtual {p0, v0}, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->getItemAt(I)Lorg/xwalk/core/internal/XWalkNavigationItemInternal;

    move-result-object v0

    return-object v0
.end method

.method public getItemAt(I)Lorg/xwalk/core/internal/XWalkNavigationItemInternal;
    .locals 2
    .param p1, "index"    # I
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation

    .prologue
    .line 66
    if-ltz p1, :cond_0

    invoke-virtual {p0}, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    .line 67
    :goto_0
    return-object v0

    :cond_1
    new-instance v0, Lorg/xwalk/core/internal/XWalkNavigationItemInternal;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->mHistory:Lorg/chromium/content_public/browser/NavigationHistory;

    invoke-virtual {v1, p1}, Lorg/chromium/content_public/browser/NavigationHistory;->getEntryAtIndex(I)Lorg/chromium/content_public/browser/NavigationEntry;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xwalk/core/internal/XWalkNavigationItemInternal;-><init>(Lorg/chromium/content_public/browser/NavigationEntry;)V

    goto :goto_0
.end method

.method public hasItemAt(I)Z
    .locals 1
    .param p1, "index"    # I
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation

    .prologue
    .line 55
    if-ltz p1, :cond_0

    invoke-virtual {p0}, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-gt p1, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public navigate(Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal$DirectionInternal;I)V
    .locals 2
    .param p1, "direction"    # Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal$DirectionInternal;
    .param p2, "steps"    # I
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation

    .prologue
    .line 121
    sget-object v0, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal$1;->$SwitchMap$org$xwalk$core$internal$XWalkNavigationHistoryInternal$DirectionInternal:[I

    invoke-virtual {p1}, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal$DirectionInternal;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 131
    :goto_0
    return-void

    .line 123
    :pswitch_0
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v0, p2}, Lorg/xwalk/core/internal/XWalkViewInternal;->navigateTo(I)V

    goto :goto_0

    .line 126
    :pswitch_1
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    neg-int v1, p2

    invoke-virtual {v0, v1}, Lorg/xwalk/core/internal/XWalkViewInternal;->navigateTo(I)V

    goto :goto_0

    .line 121
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public size()I
    .locals 1
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation

    .prologue
    .line 44
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->mHistory:Lorg/chromium/content_public/browser/NavigationHistory;

    invoke-virtual {v0}, Lorg/chromium/content_public/browser/NavigationHistory;->getEntryCount()I

    move-result v0

    return v0
.end method
