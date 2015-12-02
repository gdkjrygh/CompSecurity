.class public abstract Lcom/facebook/ui/images/base/b;
.super Ljava/lang/Object;
.source "UrlImageProcessor.java"


# static fields
.field public static d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 12
    new-instance v0, Ljava/lang/String;

    const-string v1, "no-cache"

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/ui/images/base/b;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
.end method

.method public abstract a()Ljava/lang/String;
.end method
