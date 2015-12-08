.class public Lorg/xwalk/core/XWalkMixedResources;
.super Landroid/content/res/Resources;
.source "XWalkMixedResources.java"


# instance fields
.field private mLibraryResource:Landroid/content/res/Resources;


# direct methods
.method constructor <init>(Landroid/content/res/Resources;Landroid/content/res/Resources;)V
    .locals 3
    .param p1, "base"    # Landroid/content/res/Resources;
    .param p2, "libraryResources"    # Landroid/content/res/Resources;

    .prologue
    .line 56
    invoke-virtual {p1}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Landroid/content/res/Resources;-><init>(Landroid/content/res/AssetManager;Landroid/util/DisplayMetrics;Landroid/content/res/Configuration;)V

    .line 58
    iput-object p2, p0, Lorg/xwalk/core/XWalkMixedResources;->mLibraryResource:Landroid/content/res/Resources;

    .line 59
    return-void
.end method

.method private isCalledInLibrary()Z
    .locals 8

    .prologue
    const/4 v6, 0x0

    .line 41
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v5

    .line 42
    .local v5, "stacks":[Ljava/lang/StackTraceElement;
    move-object v0, v5

    .local v0, "arr$":[Ljava/lang/StackTraceElement;
    array-length v3, v0

    .local v3, "len$":I
    const/4 v2, 0x0

    .local v2, "i$":I
    :goto_0
    if-ge v2, v3, :cond_1

    aget-object v4, v0, v2

    .line 43
    .local v4, "stack":Ljava/lang/StackTraceElement;
    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v1

    .line 44
    .local v1, "className":Ljava/lang/String;
    const-string v7, "org.chromium"

    invoke-virtual {v1, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_0

    const-string v7, "org.xwalk.core.internal"

    invoke-virtual {v1, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 46
    :cond_0
    const/4 v6, 0x1

    .line 52
    .end local v1    # "className":Ljava/lang/String;
    .end local v4    # "stack":Ljava/lang/StackTraceElement;
    :cond_1
    return v6

    .line 47
    .restart local v1    # "className":Ljava/lang/String;
    .restart local v4    # "stack":Ljava/lang/StackTraceElement;
    :cond_2
    const-string v7, "org.xwalk.core"

    invoke-virtual {v1, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3

    const-string v7, "XWalkMixedResources"

    invoke-virtual {v1, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 42
    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0
.end method


# virtual methods
.method public getDrawable(I)Landroid/graphics/drawable/Drawable;
    .locals 3
    .param p1, "id"    # I

    .prologue
    .line 123
    invoke-direct {p0}, Lorg/xwalk/core/XWalkMixedResources;->isCalledInLibrary()Z

    move-result v0

    .line 125
    .local v0, "calledInLibrary":Z
    if-eqz v0, :cond_0

    :try_start_0
    iget-object v2, p0, Lorg/xwalk/core/XWalkMixedResources;->mLibraryResource:Landroid/content/res/Resources;

    invoke-virtual {v2, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 129
    :goto_0
    return-object v2

    .line 126
    :cond_0
    invoke-super {p0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    goto :goto_0

    .line 127
    :catch_0
    move-exception v1

    .line 128
    .local v1, "e":Landroid/content/res/Resources$NotFoundException;
    if-eqz v0, :cond_1

    invoke-super {p0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    goto :goto_0

    .line 129
    :cond_1
    iget-object v2, p0, Lorg/xwalk/core/XWalkMixedResources;->mLibraryResource:Landroid/content/res/Resources;

    invoke-virtual {v2, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    goto :goto_0
.end method

.method public getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    .locals 3
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "defType"    # Ljava/lang/String;
    .param p3, "defPackage"    # Ljava/lang/String;

    .prologue
    .line 111
    invoke-direct {p0}, Lorg/xwalk/core/XWalkMixedResources;->isCalledInLibrary()Z

    move-result v0

    .line 112
    .local v0, "calledInLibrary":Z
    if-eqz v0, :cond_1

    .line 113
    iget-object v2, p0, Lorg/xwalk/core/XWalkMixedResources;->mLibraryResource:Landroid/content/res/Resources;

    invoke-virtual {v2, p1, p2, p3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 114
    .local v1, "id":I
    if-eqz v1, :cond_0

    move v2, v1

    .line 117
    :goto_0
    return v2

    .line 114
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    goto :goto_0

    .line 116
    .end local v1    # "id":I
    :cond_1
    invoke-super {p0, p1, p2, p3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 117
    .restart local v1    # "id":I
    if-eqz v1, :cond_2

    move v2, v1

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lorg/xwalk/core/XWalkMixedResources;->mLibraryResource:Landroid/content/res/Resources;

    invoke-virtual {v2, p1, p2, p3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    goto :goto_0
.end method

.method public getLayout(I)Landroid/content/res/XmlResourceParser;
    .locals 3
    .param p1, "id"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    .prologue
    .line 75
    invoke-direct {p0}, Lorg/xwalk/core/XWalkMixedResources;->isCalledInLibrary()Z

    move-result v0

    .line 77
    .local v0, "calledInLibrary":Z
    if-eqz v0, :cond_0

    :try_start_0
    iget-object v2, p0, Lorg/xwalk/core/XWalkMixedResources;->mLibraryResource:Landroid/content/res/Resources;

    invoke-virtual {v2, p1}, Landroid/content/res/Resources;->getLayout(I)Landroid/content/res/XmlResourceParser;

    move-result-object v2

    .line 81
    :goto_0
    return-object v2

    .line 78
    :cond_0
    invoke-super {p0, p1}, Landroid/content/res/Resources;->getLayout(I)Landroid/content/res/XmlResourceParser;
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    goto :goto_0

    .line 79
    :catch_0
    move-exception v1

    .line 80
    .local v1, "e":Landroid/content/res/Resources$NotFoundException;
    if-eqz v0, :cond_1

    invoke-super {p0, p1}, Landroid/content/res/Resources;->getLayout(I)Landroid/content/res/XmlResourceParser;

    move-result-object v2

    goto :goto_0

    .line 81
    :cond_1
    iget-object v2, p0, Lorg/xwalk/core/XWalkMixedResources;->mLibraryResource:Landroid/content/res/Resources;

    invoke-virtual {v2, p1}, Landroid/content/res/Resources;->getLayout(I)Landroid/content/res/XmlResourceParser;

    move-result-object v2

    goto :goto_0
.end method

.method public getText(I)Ljava/lang/CharSequence;
    .locals 3
    .param p1, "id"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    .prologue
    .line 63
    invoke-direct {p0}, Lorg/xwalk/core/XWalkMixedResources;->isCalledInLibrary()Z

    move-result v0

    .line 65
    .local v0, "calledInLibrary":Z
    if-eqz v0, :cond_0

    :try_start_0
    iget-object v2, p0, Lorg/xwalk/core/XWalkMixedResources;->mLibraryResource:Landroid/content/res/Resources;

    invoke-virtual {v2, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v2

    .line 69
    :goto_0
    return-object v2

    .line 66
    :cond_0
    invoke-super {p0, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    goto :goto_0

    .line 67
    :catch_0
    move-exception v1

    .line 68
    .local v1, "e":Landroid/content/res/Resources$NotFoundException;
    if-eqz v0, :cond_1

    invoke-super {p0, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v2

    goto :goto_0

    .line 69
    :cond_1
    iget-object v2, p0, Lorg/xwalk/core/XWalkMixedResources;->mLibraryResource:Landroid/content/res/Resources;

    invoke-virtual {v2, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v2

    goto :goto_0
.end method

.method public getValue(ILandroid/util/TypedValue;Z)V
    .locals 3
    .param p1, "id"    # I
    .param p2, "outValue"    # Landroid/util/TypedValue;
    .param p3, "resolveRefs"    # Z

    .prologue
    .line 87
    invoke-direct {p0}, Lorg/xwalk/core/XWalkMixedResources;->isCalledInLibrary()Z

    move-result v0

    .line 89
    .local v0, "calledInLibrary":Z
    if-eqz v0, :cond_0

    :try_start_0
    iget-object v2, p0, Lorg/xwalk/core/XWalkMixedResources;->mLibraryResource:Landroid/content/res/Resources;

    invoke-virtual {v2, p1, p2, p3}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 95
    :goto_0
    return-void

    .line 90
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 91
    :catch_0
    move-exception v1

    .line 92
    .local v1, "e":Landroid/content/res/Resources$NotFoundException;
    if-eqz v0, :cond_1

    invoke-super {p0, p1, p2, p3}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    goto :goto_0

    .line 93
    :cond_1
    iget-object v2, p0, Lorg/xwalk/core/XWalkMixedResources;->mLibraryResource:Landroid/content/res/Resources;

    invoke-virtual {v2, p1, p2, p3}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    goto :goto_0
.end method

.method public getValueForDensity(IILandroid/util/TypedValue;Z)V
    .locals 3
    .param p1, "id"    # I
    .param p2, "density"    # I
    .param p3, "outValue"    # Landroid/util/TypedValue;
    .param p4, "resolveRefs"    # Z

    .prologue
    .line 99
    invoke-direct {p0}, Lorg/xwalk/core/XWalkMixedResources;->isCalledInLibrary()Z

    move-result v0

    .line 101
    .local v0, "calledInLibrary":Z
    if-eqz v0, :cond_0

    :try_start_0
    iget-object v2, p0, Lorg/xwalk/core/XWalkMixedResources;->mLibraryResource:Landroid/content/res/Resources;

    invoke-virtual {v2, p1, p2, p3, p4}, Landroid/content/res/Resources;->getValueForDensity(IILandroid/util/TypedValue;Z)V

    .line 107
    :goto_0
    return-void

    .line 102
    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Landroid/content/res/Resources;->getValueForDensity(IILandroid/util/TypedValue;Z)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 103
    :catch_0
    move-exception v1

    .line 104
    .local v1, "e":Landroid/content/res/Resources$NotFoundException;
    if-eqz v0, :cond_1

    invoke-super {p0, p1, p2, p3, p4}, Landroid/content/res/Resources;->getValueForDensity(IILandroid/util/TypedValue;Z)V

    goto :goto_0

    .line 105
    :cond_1
    iget-object v2, p0, Lorg/xwalk/core/XWalkMixedResources;->mLibraryResource:Landroid/content/res/Resources;

    invoke-virtual {v2, p1, p2, p3, p4}, Landroid/content/res/Resources;->getValueForDensity(IILandroid/util/TypedValue;Z)V

    goto :goto_0
.end method
