.class public Lcom/facebook/orca/photos/b/f;
.super Lcom/facebook/inject/d;
.source "NewPhotoUploadImageResizerProvider.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/j/a/a/a;",
        ">;"
    }
.end annotation


# static fields
.field private static final a:Lcom/facebook/prefs/shared/ae;


# instance fields
.field private final b:Lcom/facebook/prefs/shared/d;

.field private final c:Landroid/content/Context;

.field private final d:Lcom/facebook/a/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 24
    const-string v0, "messenger_new_photo_upload_native_resize_android"

    invoke-static {v0}, Lcom/facebook/f/n;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/photos/b/f;->a:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/prefs/shared/d;Landroid/content/Context;Lcom/facebook/a/a;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 35
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    .line 36
    iput-object p1, p0, Lcom/facebook/orca/photos/b/f;->b:Lcom/facebook/prefs/shared/d;

    .line 37
    iput-object p2, p0, Lcom/facebook/orca/photos/b/f;->c:Landroid/content/Context;

    .line 38
    iput-object p3, p0, Lcom/facebook/orca/photos/b/f;->d:Lcom/facebook/a/a;

    .line 39
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/j/a/a/a;
    .locals 3

    .prologue
    .line 43
    invoke-virtual {p0}, Lcom/facebook/orca/photos/b/f;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 44
    new-instance v0, Lcom/facebook/j/a/a/e;

    iget-object v1, p0, Lcom/facebook/orca/photos/b/f;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/facebook/j/a/a/e;-><init>(Landroid/content/Context;)V

    .line 47
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/facebook/j/a/a/d;

    iget-object v1, p0, Lcom/facebook/orca/photos/b/f;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/facebook/orca/photos/b/f;->d:Lcom/facebook/a/a;

    invoke-direct {v0, v1, v2}, Lcom/facebook/j/a/a/d;-><init>(Landroid/content/Context;Lcom/facebook/a/a;)V

    goto :goto_0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 22
    invoke-virtual {p0}, Lcom/facebook/orca/photos/b/f;->a()Lcom/facebook/j/a/a/a;

    move-result-object v0

    return-object v0
.end method

.method public f()Z
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 52
    .line 54
    :try_start_0
    const-string v0, "fb_nativejpeg"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    move v0, v1

    .line 58
    :goto_0
    iget-object v3, p0, Lcom/facebook/orca/photos/b/f;->b:Lcom/facebook/prefs/shared/d;

    sget-object v4, Lcom/facebook/orca/photos/b/f;->a:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v3, v4, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v3

    if-eqz v3, :cond_0

    if-eqz v0, :cond_0

    :goto_1
    return v1

    .line 55
    :catch_0
    move-exception v0

    move v0, v2

    .line 56
    goto :goto_0

    :cond_0
    move v1, v2

    .line 58
    goto :goto_1
.end method
