.class abstract Lcom/qihoo/security/opti/trashclear/filemanager/c$e;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/trashclear/filemanager/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "e"
.end annotation


# instance fields
.field b:I


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/opti/trashclear/filemanager/c$1;)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/filemanager/c$e;-><init>()V

    return-void
.end method

.method public static a(Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;)Lcom/qihoo/security/opti/trashclear/filemanager/c$e;
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 47
    sget-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/c$1;->a:[I

    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;->ordinal()I

    move-result v2

    aget v0, v0, v2

    packed-switch v0, :pswitch_data_0

    move-object v0, v1

    .line 57
    :goto_0
    return-object v0

    .line 49
    :pswitch_0
    new-instance v0, Lcom/qihoo/security/opti/trashclear/filemanager/c$b;

    invoke-direct {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/c$b;-><init>(Lcom/qihoo/security/opti/trashclear/filemanager/c$1;)V

    goto :goto_0

    .line 52
    :pswitch_1
    new-instance v0, Lcom/qihoo/security/opti/trashclear/filemanager/c$a;

    invoke-direct {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/c$a;-><init>(Lcom/qihoo/security/opti/trashclear/filemanager/c$1;)V

    goto :goto_0

    .line 47
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public abstract a(Ljava/lang/Object;)V
.end method

.method public abstract a()Z
.end method

.method public abstract a(Landroid/widget/ImageView;)Z
.end method
