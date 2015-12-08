.class public final Lcom/roidapp/baselib/f/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Landroid/graphics/Bitmap$Config;

.field public static b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 7
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    sput-object v0, Lcom/roidapp/baselib/f/a;->a:Landroid/graphics/Bitmap$Config;

    .line 14
    const/4 v0, 0x0

    sput-boolean v0, Lcom/roidapp/baselib/f/a;->b:Z

    return-void
.end method
