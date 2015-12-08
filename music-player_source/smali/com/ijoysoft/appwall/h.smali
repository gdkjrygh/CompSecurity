.class public final Lcom/ijoysoft/appwall/h;
.super Ljava/lang/Object;


# instance fields
.field final synthetic a:Lcom/ijoysoft/appwall/d;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Landroid/graphics/Bitmap;

.field private e:Lcom/ijoysoft/appwall/g;

.field private f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/ijoysoft/appwall/d;)V
    .locals 0

    iput-object p1, p0, Lcom/ijoysoft/appwall/h;->a:Lcom/ijoysoft/appwall/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/ijoysoft/appwall/h;)Lcom/ijoysoft/appwall/g;
    .locals 1

    iget-object v0, p0, Lcom/ijoysoft/appwall/h;->e:Lcom/ijoysoft/appwall/g;

    return-object v0
.end method

.method static synthetic a(Lcom/ijoysoft/appwall/h;Landroid/graphics/Bitmap;)V
    .locals 0

    iput-object p1, p0, Lcom/ijoysoft/appwall/h;->d:Landroid/graphics/Bitmap;

    return-void
.end method

.method static synthetic a(Lcom/ijoysoft/appwall/h;Lcom/ijoysoft/appwall/g;)V
    .locals 0

    iput-object p1, p0, Lcom/ijoysoft/appwall/h;->e:Lcom/ijoysoft/appwall/g;

    return-void
.end method

.method static synthetic a(Lcom/ijoysoft/appwall/h;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ijoysoft/appwall/h;->b:Ljava/lang/String;

    return-void
.end method

.method static synthetic b(Lcom/ijoysoft/appwall/h;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ijoysoft/appwall/h;->b:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lcom/ijoysoft/appwall/h;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ijoysoft/appwall/h;->c:Ljava/lang/String;

    return-void
.end method

.method static synthetic c(Lcom/ijoysoft/appwall/h;)Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/ijoysoft/appwall/h;->d:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method static synthetic c(Lcom/ijoysoft/appwall/h;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ijoysoft/appwall/h;->f:Ljava/lang/String;

    return-void
.end method

.method static synthetic d(Lcom/ijoysoft/appwall/h;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ijoysoft/appwall/h;->f:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    check-cast p1, Lcom/ijoysoft/appwall/h;

    iget-object v0, p0, Lcom/ijoysoft/appwall/h;->b:Ljava/lang/String;

    iget-object v1, p1, Lcom/ijoysoft/appwall/h;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
