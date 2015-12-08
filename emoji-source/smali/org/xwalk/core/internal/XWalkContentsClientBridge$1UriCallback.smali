.class abstract Lorg/xwalk/core/internal/XWalkContentsClientBridge$1UriCallback;
.super Ljava/lang/Object;
.source "XWalkContentsClientBridge.java"

# interfaces
.implements Landroid/webkit/ValueCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/xwalk/core/internal/XWalkContentsClientBridge;->shouldOverrideRunFileChooser(IIILjava/lang/String;Z)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x400
    name = "UriCallback"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/webkit/ValueCallback",
        "<",
        "Landroid/net/Uri;",
        ">;"
    }
.end annotation


# instance fields
.field syncCallFinished:Z

.field syncNullReceived:Z

.field final synthetic this$0:Lorg/xwalk/core/internal/XWalkContentsClientBridge;


# direct methods
.method constructor <init>(Lorg/xwalk/core/internal/XWalkContentsClientBridge;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 487
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge$1UriCallback;->this$0:Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 488
    iput-boolean v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge$1UriCallback;->syncNullReceived:Z

    .line 489
    iput-boolean v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge$1UriCallback;->syncCallFinished:Z

    return-void
.end method


# virtual methods
.method protected resolveFileName(Landroid/net/Uri;Landroid/content/ContentResolver;)Ljava/lang/String;
    .locals 9
    .param p1, "uri"    # Landroid/net/Uri;
    .param p2, "contentResolver"    # Landroid/content/ContentResolver;

    .prologue
    .line 491
    if-eqz p2, :cond_0

    if-nez p1, :cond_2

    :cond_0
    const-string v0, ""

    .line 508
    :cond_1
    :goto_0
    return-object v0

    .line 492
    :cond_2
    const/4 v6, 0x0

    .line 494
    .local v6, "cursor":Landroid/database/Cursor;
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p2

    move-object v1, p1

    :try_start_0
    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 496
    if-eqz v6, :cond_3

    invoke-interface {v6}, Landroid/database/Cursor;->getCount()I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_3

    .line 497
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    .line 498
    const-string v0, "_display_name"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    .line 499
    .local v8, "index":I
    const/4 v0, -0x1

    if-le v8, v0, :cond_3

    invoke-interface {v6, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 506
    if-eqz v6, :cond_1

    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .end local v8    # "index":I
    :cond_3
    if-eqz v6, :cond_4

    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 508
    :cond_4
    const-string v0, ""

    goto :goto_0

    .line 501
    :catch_0
    move-exception v7

    .line 504
    .local v7, "e":Ljava/lang/NullPointerException;
    :try_start_1
    const-string v0, ""
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 506
    if-eqz v6, :cond_1

    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .end local v7    # "e":Ljava/lang/NullPointerException;
    :catchall_0
    move-exception v0

    if-eqz v6, :cond_5

    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    :cond_5
    throw v0
.end method
