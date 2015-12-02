.class Lcom/facebook/orca/notify/h;
.super Ljava/lang/Object;
.source "DefaultMessagingNotificationHandler.java"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Landroid/graphics/Bitmap;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    .prologue
    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    iput-object p1, p0, Lcom/facebook/orca/notify/h;->a:Ljava/lang/String;

    .line 78
    iput-object p2, p0, Lcom/facebook/orca/notify/h;->b:Ljava/lang/String;

    .line 79
    iput-object p3, p0, Lcom/facebook/orca/notify/h;->c:Landroid/graphics/Bitmap;

    .line 80
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Lcom/facebook/orca/notify/g;)V
    .locals 0

    .prologue
    .line 71
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/orca/notify/h;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/notify/h;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lcom/facebook/orca/notify/h;->c:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/orca/notify/h;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lcom/facebook/orca/notify/h;->a:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/orca/notify/h;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lcom/facebook/orca/notify/h;->b:Ljava/lang/String;

    return-object v0
.end method
