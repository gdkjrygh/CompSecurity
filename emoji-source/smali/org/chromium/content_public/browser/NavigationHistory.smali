.class public Lorg/chromium/content_public/browser/NavigationHistory;
.super Ljava/lang/Object;
.source "NavigationHistory.java"


# instance fields
.field private mCurrentEntryIndex:I

.field private final mEntries:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lorg/chromium/content_public/browser/NavigationEntry;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/chromium/content_public/browser/NavigationHistory;->mEntries:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public addEntry(Lorg/chromium/content_public/browser/NavigationEntry;)V
    .locals 1
    .param p1, "entry"    # Lorg/chromium/content_public/browser/NavigationEntry;

    .prologue
    .line 22
    iget-object v0, p0, Lorg/chromium/content_public/browser/NavigationHistory;->mEntries:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    return-void
.end method

.method public getCurrentEntryIndex()I
    .locals 1

    .prologue
    .line 48
    iget v0, p0, Lorg/chromium/content_public/browser/NavigationHistory;->mCurrentEntryIndex:I

    return v0
.end method

.method public getEntryAtIndex(I)Lorg/chromium/content_public/browser/NavigationEntry;
    .locals 1
    .param p1, "index"    # I

    .prologue
    .line 40
    iget-object v0, p0, Lorg/chromium/content_public/browser/NavigationHistory;->mEntries:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/chromium/content_public/browser/NavigationEntry;

    return-object v0
.end method

.method public getEntryCount()I
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lorg/chromium/content_public/browser/NavigationHistory;->mEntries:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public setCurrentEntryIndex(I)V
    .locals 0
    .param p1, "currentEntryIndex"    # I

    .prologue
    .line 26
    iput p1, p0, Lorg/chromium/content_public/browser/NavigationHistory;->mCurrentEntryIndex:I

    .line 27
    return-void
.end method
