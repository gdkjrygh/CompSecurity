.class final Lorg/xwalk/core/internal/XWalkViewDelegate$1;
.super Ljava/lang/Object;
.source "XWalkViewDelegate.java"

# interfaces
.implements Lorg/chromium/base/ResourceExtractor$ResourceIntercepter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/xwalk/core/internal/XWalkViewDelegate;->init(Lorg/xwalk/core/internal/XWalkViewInternal;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$assets:Landroid/content/res/AssetManager;

.field final synthetic val$context:Landroid/content/Context;

.field final synthetic val$resourcesListResId:I


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/content/res/AssetManager;I)V
    .locals 0

    .prologue
    .line 145
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkViewDelegate$1;->val$context:Landroid/content/Context;

    iput-object p2, p0, Lorg/xwalk/core/internal/XWalkViewDelegate$1;->val$assets:Landroid/content/res/AssetManager;

    iput p3, p0, Lorg/xwalk/core/internal/XWalkViewDelegate$1;->val$resourcesListResId:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getInterceptableResourceList()Ljava/util/Set;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 149
    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 150
    .local v6, "resourcesList":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    iget-object v7, p0, Lorg/xwalk/core/internal/XWalkViewDelegate$1;->val$context:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Lorg/xwalk/core/internal/XWalkViewDelegate$1;->val$context:Landroid/content/Context;

    invoke-virtual {v8}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_0

    .line 153
    :try_start_0
    iget-object v7, p0, Lorg/xwalk/core/internal/XWalkViewDelegate$1;->val$assets:Landroid/content/res/AssetManager;

    const-string v8, ""

    invoke-virtual {v7, v8}, Landroid/content/res/AssetManager;->list(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .local v0, "arr$":[Ljava/lang/String;
    array-length v3, v0

    .local v3, "len$":I
    const/4 v2, 0x0

    .local v2, "i$":I
    :goto_0
    if-ge v2, v3, :cond_0

    aget-object v4, v0, v2

    .line 154
    .local v4, "resource":Ljava/lang/String;
    invoke-interface {v6, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 153
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 156
    .end local v0    # "arr$":[Ljava/lang/String;
    .end local v2    # "i$":I
    .end local v3    # "len$":I
    .end local v4    # "resource":Ljava/lang/String;
    :catch_0
    move-exception v7

    .line 158
    :cond_0
    iget v7, p0, Lorg/xwalk/core/internal/XWalkViewDelegate$1;->val$resourcesListResId:I

    if-eqz v7, :cond_1

    .line 160
    :try_start_1
    iget-object v7, p0, Lorg/xwalk/core/internal/XWalkViewDelegate$1;->val$context:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    iget v8, p0, Lorg/xwalk/core/internal/XWalkViewDelegate$1;->val$resourcesListResId:I

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v5

    .line 161
    .local v5, "resources":[Ljava/lang/String;
    move-object v0, v5

    .restart local v0    # "arr$":[Ljava/lang/String;
    array-length v3, v0

    .restart local v3    # "len$":I
    const/4 v2, 0x0

    .restart local v2    # "i$":I
    :goto_1
    if-ge v2, v3, :cond_1

    aget-object v4, v0, v2

    .line 162
    .restart local v4    # "resource":Ljava/lang/String;
    invoke-interface {v6, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 161
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 164
    .end local v0    # "arr$":[Ljava/lang/String;
    .end local v2    # "i$":I
    .end local v3    # "len$":I
    .end local v4    # "resource":Ljava/lang/String;
    .end local v5    # "resources":[Ljava/lang/String;
    :catch_1
    move-exception v1

    .line 165
    .local v1, "e":Landroid/content/res/Resources$NotFoundException;
    const-string v7, "XWalkViewDelegate"

    const-string v8, "R.array.xwalk_resources_list can\'t be found."

    invoke-static {v7, v8}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 168
    .end local v1    # "e":Landroid/content/res/Resources$NotFoundException;
    :cond_1
    return-object v6
.end method

.method public interceptLoadingForResource(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 7
    .param p1, "resource"    # Ljava/lang/String;

    .prologue
    .line 173
    iget-object v4, p0, Lorg/xwalk/core/internal/XWalkViewDelegate$1;->val$context:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lorg/xwalk/core/internal/XWalkViewDelegate$1;->val$context:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 176
    :try_start_0
    iget-object v4, p0, Lorg/xwalk/core/internal/XWalkViewDelegate$1;->val$context:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v4

    invoke-virtual {v4, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 177
    .local v1, "fromAsset":Ljava/io/InputStream;
    if-eqz v1, :cond_0

    .line 194
    .end local v1    # "fromAsset":Ljava/io/InputStream;
    :goto_0
    return-object v1

    .line 178
    :catch_0
    move-exception v0

    .line 179
    .local v0, "e":Ljava/io/IOException;
    const-string v4, "XWalkViewDelegate"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " can\'t be found in assets."

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 183
    .end local v0    # "e":Ljava/io/IOException;
    :cond_0
    iget v4, p0, Lorg/xwalk/core/internal/XWalkViewDelegate$1;->val$resourcesListResId:I

    if-eqz v4, :cond_1

    .line 184
    const-string v4, "\\."

    invoke-virtual {p1, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aget-object v3, v4, v5

    .line 185
    .local v3, "resourceName":Ljava/lang/String;
    iget-object v4, p0, Lorg/xwalk/core/internal/XWalkViewDelegate$1;->val$context:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const-string v5, "raw"

    iget-object v6, p0, Lorg/xwalk/core/internal/XWalkViewDelegate$1;->val$context:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v3, v5, v6}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    .line 188
    .local v2, "resId":I
    if-eqz v2, :cond_1

    :try_start_1
    iget-object v4, p0, Lorg/xwalk/core/internal/XWalkViewDelegate$1;->val$context:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v1

    goto :goto_0

    .line 189
    :catch_1
    move-exception v0

    .line 190
    .local v0, "e":Landroid/content/res/Resources$NotFoundException;
    const-string v4, "XWalkViewDelegate"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "R.raw."

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " can\'t be found."

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 194
    .end local v0    # "e":Landroid/content/res/Resources$NotFoundException;
    .end local v2    # "resId":I
    .end local v3    # "resourceName":Ljava/lang/String;
    :cond_1
    const/4 v1, 0x0

    goto :goto_0
.end method
