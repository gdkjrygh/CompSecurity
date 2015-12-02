.class synthetic Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$1;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic a:[I

.field static final synthetic b:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 152
    invoke-static {}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;->values()[Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$1;->b:[I

    :try_start_0
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$1;->b:[I

    sget-object v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;->INTERNAL:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;

    invoke-virtual {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_6

    :goto_0
    :try_start_1
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$1;->b:[I

    sget-object v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;->INTERNAL_SYSTEM:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;

    invoke-virtual {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_5

    :goto_1
    :try_start_2
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$1;->b:[I

    sget-object v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;->INTERNAL_EXTERNAL:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;

    invoke-virtual {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_4

    :goto_2
    :try_start_3
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$1;->b:[I

    sget-object v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;->SYSTEM_INTERNAL_EXTERNAL:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;

    invoke-virtual {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    .line 168
    :goto_3
    invoke-static {}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;->values()[Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$1;->a:[I

    :try_start_4
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$1;->a:[I

    sget-object v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;->SYSTEM:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;

    invoke-virtual {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_2

    :goto_4
    :try_start_5
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$1;->a:[I

    sget-object v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;->INTERNAL:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;

    invoke-virtual {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_1

    :goto_5
    :try_start_6
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$1;->a:[I

    sget-object v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;->EXTERNAL:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;

    invoke-virtual {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_0

    :goto_6
    return-void

    :catch_0
    move-exception v0

    goto :goto_6

    :catch_1
    move-exception v0

    goto :goto_5

    :catch_2
    move-exception v0

    goto :goto_4

    .line 152
    :catch_3
    move-exception v0

    goto :goto_3

    :catch_4
    move-exception v0

    goto :goto_2

    :catch_5
    move-exception v0

    goto :goto_1

    :catch_6
    move-exception v0

    goto :goto_0
.end method
