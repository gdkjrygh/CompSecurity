.class public Lcom/qihoo/security/opti/trashclear/filemanager/b;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/opti/trashclear/filemanager/c$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/opti/trashclear/filemanager/b$1;
    }
.end annotation


# static fields
.field private static a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Landroid/widget/ImageView;",
            "Landroid/widget/ImageView;",
            ">;"
        }
    .end annotation
.end field

.field private static b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private c:Lcom/qihoo/security/opti/trashclear/filemanager/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 15
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/b;->a:Ljava/util/HashMap;

    .line 17
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/b;->b:Ljava/util/HashMap;

    .line 22
    sget-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper;->g:[Ljava/lang/String;

    const v1, 0x7f020130

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/b;->a([Ljava/lang/String;I)V

    .line 23
    sget-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper;->e:[Ljava/lang/String;

    const v1, 0x7f02013a

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/b;->a([Ljava/lang/String;I)V

    .line 24
    sget-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper;->f:[Ljava/lang/String;

    const v1, 0x7f020137

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/b;->a([Ljava/lang/String;I)V

    .line 25
    sget-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper;->c:[Ljava/lang/String;

    const v1, 0x7f020139

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/b;->a([Ljava/lang/String;I)V

    .line 26
    sget-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper;->d:[Ljava/lang/String;

    const v1, 0x7f02013b

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/b;->a([Ljava/lang/String;I)V

    .line 27
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string/jumbo v2, "apk"

    aput-object v2, v0, v1

    const v1, 0x7f02012f

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/b;->a([Ljava/lang/String;I)V

    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v0, Lcom/qihoo/security/opti/trashclear/filemanager/c;

    invoke-direct {v0, p1, p0}, Lcom/qihoo/security/opti/trashclear/filemanager/c;-><init>(Landroid/content/Context;Lcom/qihoo/security/opti/trashclear/filemanager/c$d;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/b;->c:Lcom/qihoo/security/opti/trashclear/filemanager/c;

    .line 32
    return-void
.end method

.method public static a(Ljava/lang/String;)I
    .locals 2

    .prologue
    .line 43
    sget-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/b;->b:Ljava/util/HashMap;

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 44
    if-eqz v0, :cond_0

    .line 45
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 47
    :goto_0
    return v0

    :cond_0
    const v0, 0x7f020139

    goto :goto_0
.end method

.method private static a([Ljava/lang/String;I)V
    .locals 5

    .prologue
    .line 35
    if-eqz p0, :cond_0

    .line 36
    array-length v1, p0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    aget-object v2, p0, v0

    .line 37
    sget-object v3, Lcom/qihoo/security/opti/trashclear/filemanager/b;->b:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 40
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Landroid/widget/ImageView;)V
    .locals 2

    .prologue
    .line 91
    sget-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/b;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 92
    if-eqz v0, :cond_0

    .line 93
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 94
    sget-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/b;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    :cond_0
    return-void
.end method

.method public a(Lcom/qihoo/security/opti/trashclear/filemanager/d;Landroid/widget/ImageView;Landroid/widget/ImageView;)V
    .locals 8

    .prologue
    const/4 v7, 0x1

    .line 53
    iget-object v3, p1, Lcom/qihoo/security/opti/trashclear/filemanager/d;->b:Ljava/lang/String;

    .line 54
    iget-wide v4, p1, Lcom/qihoo/security/opti/trashclear/filemanager/d;->k:J

    .line 55
    invoke-static {v3}, Lcom/qihoo/security/opti/trashclear/filemanager/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 56
    invoke-static {v3}, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper;->a(Ljava/lang/String;)Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    move-result-object v6

    .line 59
    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/b;->a(Ljava/lang/String;)I

    move-result v0

    .line 60
    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 62
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/b;->c:Lcom/qihoo/security/opti/trashclear/filemanager/c;

    invoke-virtual {v0, p2}, Lcom/qihoo/security/opti/trashclear/filemanager/c;->a(Landroid/widget/ImageView;)V

    .line 63
    sget-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/b$1;->a:[I

    invoke-virtual {v6}, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    move v0, v7

    .line 86
    :cond_0
    :goto_0
    if-nez v0, :cond_1

    .line 87
    const v0, 0x7f020139

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 88
    :cond_1
    return-void

    .line 65
    :pswitch_0
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/b;->c:Lcom/qihoo/security/opti/trashclear/filemanager/c;

    move-object v2, p2

    invoke-virtual/range {v1 .. v6}, Lcom/qihoo/security/opti/trashclear/filemanager/c;->a(Landroid/widget/ImageView;Ljava/lang/String;JLcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;)Z

    move v0, v7

    .line 67
    goto :goto_0

    .line 70
    :pswitch_1
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/b;->c:Lcom/qihoo/security/opti/trashclear/filemanager/c;

    move-object v2, p2

    invoke-virtual/range {v1 .. v6}, Lcom/qihoo/security/opti/trashclear/filemanager/c;->a(Landroid/widget/ImageView;Ljava/lang/String;JLcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;)Z

    move-result v0

    .line 71
    if-nez v0, :cond_0

    .line 75
    sget-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;->Picture:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    if-ne v6, v0, :cond_2

    const v0, 0x7f020137

    :goto_1
    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    move v0, v7

    .line 80
    goto :goto_0

    .line 75
    :cond_2
    const v0, 0x7f02013a

    goto :goto_1

    .line 63
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method
