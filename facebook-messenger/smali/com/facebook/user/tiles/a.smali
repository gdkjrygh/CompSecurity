.class public Lcom/facebook/user/tiles/a;
.super Ljava/lang/Object;
.source "DefaultUserTiles.java"


# static fields
.field public static a:I

.field public static b:Lcom/facebook/widget/tiles/a;

.field public static c:Lcom/facebook/widget/tiles/a;

.field public static d:Lcom/facebook/widget/tiles/a;


# instance fields
.field private final e:Lcom/facebook/widget/tiles/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 19
    const/16 v0, 0xff

    const/16 v1, 0xcc

    const/16 v2, 0xd3

    const/16 v3, 0xe0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    sput v0, Lcom/facebook/user/tiles/a;->a:I

    .line 21
    new-instance v0, Lcom/facebook/widget/tiles/a;

    const-string v1, "user"

    sget v2, Lcom/facebook/h;->orca_default_user_tile:I

    sget v3, Lcom/facebook/user/tiles/a;->a:I

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/widget/tiles/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/user/tiles/a;->b:Lcom/facebook/widget/tiles/a;

    .line 25
    new-instance v0, Lcom/facebook/widget/tiles/a;

    const-string v1, "email"

    sget v2, Lcom/facebook/h;->orca_default_email_tile:I

    sget v3, Lcom/facebook/user/tiles/a;->a:I

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/widget/tiles/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/user/tiles/a;->c:Lcom/facebook/widget/tiles/a;

    .line 29
    new-instance v0, Lcom/facebook/widget/tiles/a;

    const-string v1, "sms"

    sget v2, Lcom/facebook/h;->orca_default_sms_tile:I

    sget v3, Lcom/facebook/user/tiles/a;->a:I

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/widget/tiles/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/user/tiles/a;->d:Lcom/facebook/widget/tiles/a;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/widget/tiles/b;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/facebook/user/tiles/a;->e:Lcom/facebook/widget/tiles/b;

    .line 38
    return-void
.end method


# virtual methods
.method public a(II)Landroid/graphics/drawable/Drawable;
    .locals 2

    .prologue
    .line 72
    iget-object v0, p0, Lcom/facebook/user/tiles/a;->e:Lcom/facebook/widget/tiles/b;

    sget-object v1, Lcom/facebook/user/tiles/a;->b:Lcom/facebook/widget/tiles/a;

    invoke-virtual {v0, v1, p1, p2}, Lcom/facebook/widget/tiles/b;->a(Lcom/facebook/widget/tiles/a;II)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/user/UserKey;II)Landroid/graphics/drawable/Drawable;
    .locals 2

    .prologue
    .line 50
    if-eqz p1, :cond_3

    .line 51
    invoke-virtual {p1}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v0

    sget-object v1, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    if-ne v0, v1, :cond_0

    .line 52
    invoke-virtual {p0, p2, p3}, Lcom/facebook/user/tiles/a;->a(II)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 61
    :goto_0
    return-object v0

    .line 53
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v0

    sget-object v1, Lcom/facebook/user/n;->PHONE_NUMBER:Lcom/facebook/user/n;

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v0

    sget-object v1, Lcom/facebook/user/n;->ADDRESS_BOOK:Lcom/facebook/user/n;

    if-ne v0, v1, :cond_2

    .line 55
    :cond_1
    invoke-virtual {p0, p2, p3}, Lcom/facebook/user/tiles/a;->c(II)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0

    .line 56
    :cond_2
    invoke-virtual {p1}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v0

    sget-object v1, Lcom/facebook/user/n;->EMAIL:Lcom/facebook/user/n;

    if-ne v0, v1, :cond_3

    .line 57
    invoke-virtual {p0, p2, p3}, Lcom/facebook/user/tiles/a;->b(II)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0

    .line 61
    :cond_3
    invoke-virtual {p0, p2, p3}, Lcom/facebook/user/tiles/a;->a(II)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Lcom/facebook/user/n;)Lcom/facebook/widget/tiles/a;
    .locals 2

    .prologue
    .line 98
    sget-object v0, Lcom/facebook/user/tiles/b;->a:[I

    invoke-virtual {p1}, Lcom/facebook/user/n;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 109
    sget-object v0, Lcom/facebook/user/tiles/a;->b:Lcom/facebook/widget/tiles/a;

    :goto_0
    return-object v0

    .line 101
    :pswitch_0
    sget-object v0, Lcom/facebook/user/tiles/a;->d:Lcom/facebook/widget/tiles/a;

    goto :goto_0

    .line 103
    :pswitch_1
    sget-object v0, Lcom/facebook/user/tiles/a;->c:Lcom/facebook/widget/tiles/a;

    goto :goto_0

    .line 107
    :pswitch_2
    sget-object v0, Lcom/facebook/user/tiles/a;->b:Lcom/facebook/widget/tiles/a;

    goto :goto_0

    .line 98
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method public b(II)Landroid/graphics/drawable/Drawable;
    .locals 2

    .prologue
    .line 83
    iget-object v0, p0, Lcom/facebook/user/tiles/a;->e:Lcom/facebook/widget/tiles/b;

    sget-object v1, Lcom/facebook/user/tiles/a;->c:Lcom/facebook/widget/tiles/a;

    invoke-virtual {v0, v1, p1, p2}, Lcom/facebook/widget/tiles/b;->a(Lcom/facebook/widget/tiles/a;II)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public c(II)Landroid/graphics/drawable/Drawable;
    .locals 2

    .prologue
    .line 94
    iget-object v0, p0, Lcom/facebook/user/tiles/a;->e:Lcom/facebook/widget/tiles/b;

    sget-object v1, Lcom/facebook/user/tiles/a;->d:Lcom/facebook/widget/tiles/a;

    invoke-virtual {v0, v1, p1, p2}, Lcom/facebook/widget/tiles/b;->a(Lcom/facebook/widget/tiles/a;II)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method
