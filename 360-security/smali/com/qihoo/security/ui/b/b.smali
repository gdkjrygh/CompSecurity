.class public Lcom/qihoo/security/ui/b/b;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/ui/b/b$c;,
        Lcom/qihoo/security/ui/b/b$a;,
        Lcom/qihoo/security/ui/b/b$b;
    }
.end annotation


# static fields
.field private static final a:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final c:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final d:Landroid/util/SparseIntArray;

.field private static final e:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final f:I

.field private static g:Lcom/qihoo/security/ui/b/b;


# instance fields
.field private h:I

.field private i:I

.field private final j:Z

.field private k:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Lcom/qihoo/security/ui/b/b$a;",
            ">;"
        }
    .end annotation
.end field

.field private l:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Lcom/qihoo/security/ui/b/b$c;",
            ">;"
        }
    .end annotation
.end field

.field private m:Landroid/os/Handler;

.field private final n:Ljava/util/Random;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x6

    const/16 v6, 0xc

    const/4 v5, 0x1

    const/16 v4, 0xa

    const/4 v3, 0x0

    .line 46
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Lcom/qihoo/security/ui/b/b;->a:Landroid/util/SparseArray;

    .line 47
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Lcom/qihoo/security/ui/b/b;->b:Landroid/util/SparseArray;

    .line 48
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Lcom/qihoo/security/ui/b/b;->c:Landroid/util/SparseArray;

    .line 49
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lcom/qihoo/security/ui/b/b;->d:Landroid/util/SparseIntArray;

    .line 50
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Lcom/qihoo/security/ui/b/b;->e:Landroid/util/SparseArray;

    .line 54
    const-string/jumbo v0, "<<<<< Finished to "

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    sput v0, Lcom/qihoo/security/ui/b/b;->f:I

    .line 58
    new-instance v0, Lcom/qihoo/security/ui/b/b;

    invoke-direct {v0}, Lcom/qihoo/security/ui/b/b;-><init>()V

    sput-object v0, Lcom/qihoo/security/ui/b/b;->g:Lcom/qihoo/security/ui/b/b;

    .line 61
    sget-object v0, Lcom/qihoo/security/ui/b/b;->a:Landroid/util/SparseArray;

    const-string/jumbo v1, "\u52a0\u901f"

    invoke-virtual {v0, v3, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 62
    sget-object v0, Lcom/qihoo/security/ui/b/b;->e:Landroid/util/SparseArray;

    const-string/jumbo v1, "pt_fr_boost"

    invoke-virtual {v0, v3, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 63
    sget-object v0, Lcom/qihoo/security/ui/b/b;->a:Landroid/util/SparseArray;

    const-string/jumbo v1, "\u6e05\u7406:\u626b\u63cf"

    invoke-virtual {v0, v4, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 64
    sget-object v0, Lcom/qihoo/security/ui/b/b;->a:Landroid/util/SparseArray;

    const/16 v1, 0xb

    const-string/jumbo v2, "\u6e05\u7406\u7ed3\u675f"

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 65
    sget-object v0, Lcom/qihoo/security/ui/b/b;->e:Landroid/util/SparseArray;

    const-string/jumbo v1, "pt_fr_clean"

    invoke-virtual {v0, v4, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 66
    sget-object v0, Lcom/qihoo/security/ui/b/b;->e:Landroid/util/SparseArray;

    const/16 v1, 0xb

    const-string/jumbo v2, "pt_fr_clean"

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 67
    sget-object v0, Lcom/qihoo/security/ui/b/b;->a:Landroid/util/SparseArray;

    const-string/jumbo v1, "\u6e05\u7406\u7ed3\u675f->\u8fd4\u56de\u4e3b\u754c\u9762"

    invoke-virtual {v0, v6, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 69
    sget-object v0, Lcom/qihoo/security/ui/b/b;->a:Landroid/util/SparseArray;

    const/16 v1, 0x14

    const-string/jumbo v2, "\u6740\u6bd2:\u626b\u63cf"

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 70
    sget-object v0, Lcom/qihoo/security/ui/b/b;->a:Landroid/util/SparseArray;

    const/16 v1, 0x15

    const-string/jumbo v2, "\u6740\u6bd2\u7ed3\u675f"

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 71
    sget-object v0, Lcom/qihoo/security/ui/b/b;->e:Landroid/util/SparseArray;

    const/16 v1, 0x14

    const-string/jumbo v2, "pt_fr_av"

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 72
    sget-object v0, Lcom/qihoo/security/ui/b/b;->e:Landroid/util/SparseArray;

    const/16 v1, 0x15

    const-string/jumbo v2, "pt_fr_av"

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 73
    sget-object v0, Lcom/qihoo/security/ui/b/b;->a:Landroid/util/SparseArray;

    const/16 v1, 0x16

    const-string/jumbo v2, "\u6740\u6bd2\u7ed3\u675f->\u8fd4\u56de\u4e3b\u754c\u9762"

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 75
    sget-object v0, Lcom/qihoo/security/ui/b/b;->b:Landroid/util/SparseArray;

    const-string/jumbo v1, "\u6309\u94ae\u9690\u85cf(\u9010\u6e10\u7f29\u5c0f)"

    invoke-virtual {v0, v5, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 76
    sget-object v0, Lcom/qihoo/security/ui/b/b;->b:Landroid/util/SparseArray;

    const/4 v1, 0x2

    const-string/jumbo v2, "\u6309\u94ae\u663e\u793a(\u9010\u6e10\u653e\u5927)"

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 77
    sget-object v0, Lcom/qihoo/security/ui/b/b;->b:Landroid/util/SparseArray;

    const-string/jumbo v1, "\u6309\u94ae\u8df3\u52a8"

    invoke-virtual {v0, v3, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 78
    sget-object v0, Lcom/qihoo/security/ui/b/b;->b:Landroid/util/SparseArray;

    const/4 v1, 0x4

    const-string/jumbo v2, "\u8868\u76d8\u9690\u85cf(\u9010\u6e10\u7f29\u5c0f)"

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 79
    sget-object v0, Lcom/qihoo/security/ui/b/b;->b:Landroid/util/SparseArray;

    const/4 v1, 0x5

    const-string/jumbo v2, "\u8868\u76d8\u663e\u793a(\u9010\u6e10\u653e\u5927)"

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 80
    sget-object v0, Lcom/qihoo/security/ui/b/b;->b:Landroid/util/SparseArray;

    const/4 v1, 0x3

    const-string/jumbo v2, "\u8868\u76d8\u56de\u6446\u5230\u6700\u5c0f"

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 81
    sget-object v0, Lcom/qihoo/security/ui/b/b;->b:Landroid/util/SparseArray;

    const/16 v1, 0xe

    const-string/jumbo v2, "\u8868\u76d8\u6446\u5230\u6700\u5927"

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 82
    sget-object v0, Lcom/qihoo/security/ui/b/b;->b:Landroid/util/SparseArray;

    const-string/jumbo v1, "Tab\u6d88\u5931(\u9010\u6e10\u4e0a\u79fb)"

    invoke-virtual {v0, v7, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 83
    sget-object v0, Lcom/qihoo/security/ui/b/b;->b:Landroid/util/SparseArray;

    const/4 v1, 0x7

    const-string/jumbo v2, "Tab\u663e\u793a(\u9010\u6e10\u4e0b\u79fb)"

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 84
    sget-object v0, Lcom/qihoo/security/ui/b/b;->b:Landroid/util/SparseArray;

    const/16 v1, 0x9

    const-string/jumbo v2, "\u706b\u7bad\u52a8\u753b"

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 85
    sget-object v0, Lcom/qihoo/security/ui/b/b;->b:Landroid/util/SparseArray;

    const-string/jumbo v1, "\u6e05\u7406\u626b\u63cf\u8fdb\u5ea6"

    invoke-virtual {v0, v4, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 86
    sget-object v0, Lcom/qihoo/security/ui/b/b;->b:Landroid/util/SparseArray;

    const/16 v1, 0xb

    const-string/jumbo v2, "\u72b6\u6001\u9690\u85cf(\u900f\u660e\u5ea6)"

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 87
    sget-object v0, Lcom/qihoo/security/ui/b/b;->b:Landroid/util/SparseArray;

    const-string/jumbo v1, "\u6740\u6bd2\u626b\u63cf\u8fdb\u5ea6"

    invoke-virtual {v0, v6, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 88
    sget-object v0, Lcom/qihoo/security/ui/b/b;->b:Landroid/util/SparseArray;

    const/16 v1, 0xd

    const-string/jumbo v2, "\u6740\u6bd2\u626b\u63cf\u96f7\u8fbe"

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 90
    sget-object v0, Lcom/qihoo/security/ui/b/b;->c:Landroid/util/SparseArray;

    const-string/jumbo v1, "btn_scale_down"

    invoke-virtual {v0, v5, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 91
    sget-object v0, Lcom/qihoo/security/ui/b/b;->c:Landroid/util/SparseArray;

    const/4 v1, 0x2

    const-string/jumbo v2, "btn_scale_up"

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 92
    sget-object v0, Lcom/qihoo/security/ui/b/b;->c:Landroid/util/SparseArray;

    const-string/jumbo v1, "btn_bump"

    invoke-virtual {v0, v3, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 93
    sget-object v0, Lcom/qihoo/security/ui/b/b;->c:Landroid/util/SparseArray;

    const/4 v1, 0x4

    const-string/jumbo v2, "dialer_scale_down"

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 94
    sget-object v0, Lcom/qihoo/security/ui/b/b;->c:Landroid/util/SparseArray;

    const/4 v1, 0x5

    const-string/jumbo v2, "dialer_scale_up"

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 95
    sget-object v0, Lcom/qihoo/security/ui/b/b;->c:Landroid/util/SparseArray;

    const/4 v1, 0x3

    const-string/jumbo v2, "dialer_2_0"

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 96
    sget-object v0, Lcom/qihoo/security/ui/b/b;->c:Landroid/util/SparseArray;

    const/16 v1, 0xe

    const-string/jumbo v2, "dailer_2_100"

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 97
    sget-object v0, Lcom/qihoo/security/ui/b/b;->c:Landroid/util/SparseArray;

    const-string/jumbo v1, "tab_trans_up"

    invoke-virtual {v0, v7, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 98
    sget-object v0, Lcom/qihoo/security/ui/b/b;->c:Landroid/util/SparseArray;

    const/4 v1, 0x7

    const-string/jumbo v2, "tab_trans_down"

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 99
    sget-object v0, Lcom/qihoo/security/ui/b/b;->c:Landroid/util/SparseArray;

    const/16 v1, 0x9

    const-string/jumbo v2, "rocket_fire"

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 101
    sget-object v0, Lcom/qihoo/security/ui/b/b;->d:Landroid/util/SparseIntArray;

    invoke-static {v3, v5}, Lcom/qihoo/security/ui/b/b;->b(II)I

    move-result v1

    const/16 v2, 0x2c3c

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 103
    sget-object v0, Lcom/qihoo/security/ui/b/b;->d:Landroid/util/SparseIntArray;

    invoke-static {v3, v3}, Lcom/qihoo/security/ui/b/b;->b(II)I

    move-result v1

    const/16 v2, 0x2c3b

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 105
    sget-object v0, Lcom/qihoo/security/ui/b/b;->d:Landroid/util/SparseIntArray;

    const/4 v1, 0x4

    invoke-static {v3, v1}, Lcom/qihoo/security/ui/b/b;->b(II)I

    move-result v1

    const/16 v2, 0x2c3e

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 107
    sget-object v0, Lcom/qihoo/security/ui/b/b;->d:Landroid/util/SparseIntArray;

    const/4 v1, 0x3

    invoke-static {v3, v1}, Lcom/qihoo/security/ui/b/b;->b(II)I

    move-result v1

    const/16 v2, 0x2c3d

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 109
    sget-object v0, Lcom/qihoo/security/ui/b/b;->d:Landroid/util/SparseIntArray;

    invoke-static {v3, v7}, Lcom/qihoo/security/ui/b/b;->b(II)I

    move-result v1

    const/16 v2, 0x2c3f

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 111
    sget-object v0, Lcom/qihoo/security/ui/b/b;->d:Landroid/util/SparseIntArray;

    const/16 v1, 0xe

    invoke-static {v3, v1}, Lcom/qihoo/security/ui/b/b;->b(II)I

    move-result v1

    const/16 v2, 0x2c41

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 113
    sget-object v0, Lcom/qihoo/security/ui/b/b;->d:Landroid/util/SparseIntArray;

    const/16 v1, 0x9

    invoke-static {v3, v1}, Lcom/qihoo/security/ui/b/b;->b(II)I

    move-result v1

    const/16 v2, 0x2c40

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 116
    sget-object v0, Lcom/qihoo/security/ui/b/b;->d:Landroid/util/SparseIntArray;

    invoke-static {v4, v3}, Lcom/qihoo/security/ui/b/b;->b(II)I

    move-result v1

    const/16 v2, 0x4858

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 118
    sget-object v0, Lcom/qihoo/security/ui/b/b;->d:Landroid/util/SparseIntArray;

    invoke-static {v4, v5}, Lcom/qihoo/security/ui/b/b;->b(II)I

    move-result v1

    const/16 v2, 0x4859

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 120
    sget-object v0, Lcom/qihoo/security/ui/b/b;->d:Landroid/util/SparseIntArray;

    const/4 v1, 0x4

    invoke-static {v4, v1}, Lcom/qihoo/security/ui/b/b;->b(II)I

    move-result v1

    const/16 v2, 0x485a

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 122
    sget-object v0, Lcom/qihoo/security/ui/b/b;->d:Landroid/util/SparseIntArray;

    invoke-static {v4, v7}, Lcom/qihoo/security/ui/b/b;->b(II)I

    move-result v1

    const/16 v2, 0x485b

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 124
    sget-object v0, Lcom/qihoo/security/ui/b/b;->d:Landroid/util/SparseIntArray;

    const/4 v1, 0x5

    invoke-static {v4, v1}, Lcom/qihoo/security/ui/b/b;->b(II)I

    move-result v1

    const/16 v2, 0x485c

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 127
    sget-object v0, Lcom/qihoo/security/ui/b/b;->d:Landroid/util/SparseIntArray;

    invoke-static {v6, v3}, Lcom/qihoo/security/ui/b/b;->b(II)I

    move-result v1

    const/16 v2, 0x485d

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 129
    sget-object v0, Lcom/qihoo/security/ui/b/b;->d:Landroid/util/SparseIntArray;

    invoke-static {v6, v5}, Lcom/qihoo/security/ui/b/b;->b(II)I

    move-result v1

    const/16 v2, 0x485e

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 131
    sget-object v0, Lcom/qihoo/security/ui/b/b;->d:Landroid/util/SparseIntArray;

    const/4 v1, 0x7

    invoke-static {v6, v1}, Lcom/qihoo/security/ui/b/b;->b(II)I

    move-result v1

    const/16 v2, 0x485f

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 133
    sget-object v0, Lcom/qihoo/security/ui/b/b;->d:Landroid/util/SparseIntArray;

    const/4 v1, 0x2

    invoke-static {v6, v1}, Lcom/qihoo/security/ui/b/b;->b(II)I

    move-result v1

    const/16 v2, 0x4860

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 136
    sget-object v0, Lcom/qihoo/security/ui/b/b;->d:Landroid/util/SparseIntArray;

    const/16 v1, 0x14

    invoke-static {v1, v3}, Lcom/qihoo/security/ui/b/b;->b(II)I

    move-result v1

    const/16 v2, 0x38b8

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 137
    sget-object v0, Lcom/qihoo/security/ui/b/b;->d:Landroid/util/SparseIntArray;

    const/16 v1, 0x14

    invoke-static {v1, v5}, Lcom/qihoo/security/ui/b/b;->b(II)I

    move-result v1

    const/16 v2, 0x38b9

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 139
    sget-object v0, Lcom/qihoo/security/ui/b/b;->d:Landroid/util/SparseIntArray;

    const/16 v1, 0x14

    invoke-static {v1, v7}, Lcom/qihoo/security/ui/b/b;->b(II)I

    move-result v1

    const/16 v2, 0x38ba

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 142
    sget-object v0, Lcom/qihoo/security/ui/b/b;->d:Landroid/util/SparseIntArray;

    const/16 v1, 0x16

    invoke-static {v1, v3}, Lcom/qihoo/security/ui/b/b;->b(II)I

    move-result v1

    const/16 v2, 0x38bb

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 144
    sget-object v0, Lcom/qihoo/security/ui/b/b;->d:Landroid/util/SparseIntArray;

    const/16 v1, 0x16

    invoke-static {v1, v5}, Lcom/qihoo/security/ui/b/b;->b(II)I

    move-result v1

    const/16 v2, 0x38bc

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 146
    sget-object v0, Lcom/qihoo/security/ui/b/b;->d:Landroid/util/SparseIntArray;

    const/16 v1, 0x16

    const/4 v2, 0x7

    invoke-static {v1, v2}, Lcom/qihoo/security/ui/b/b;->b(II)I

    move-result v1

    const/16 v2, 0x38bd

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 148
    sget-object v0, Lcom/qihoo/security/ui/b/b;->d:Landroid/util/SparseIntArray;

    const/16 v1, 0x16

    const/4 v2, 0x2

    invoke-static {v1, v2}, Lcom/qihoo/security/ui/b/b;->b(II)I

    move-result v1

    const/16 v2, 0x38be

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 150
    return-void
.end method

.method private constructor <init>()V
    .locals 4

    .prologue
    const/4 v0, 0x1

    .line 374
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 156
    const/4 v1, -0x1

    iput v1, p0, Lcom/qihoo/security/ui/b/b;->h:I

    .line 366
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    iput-object v1, p0, Lcom/qihoo/security/ui/b/b;->k:Landroid/util/SparseArray;

    .line 367
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    iput-object v1, p0, Lcom/qihoo/security/ui/b/b;->l:Landroid/util/SparseArray;

    .line 375
    new-instance v1, Ljava/util/Random;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Ljava/util/Random;-><init>(J)V

    iput-object v1, p0, Lcom/qihoo/security/ui/b/b;->n:Ljava/util/Random;

    .line 376
    iget-object v1, p0, Lcom/qihoo/security/ui/b/b;->n:Ljava/util/Random;

    const/16 v2, 0xc8

    invoke-virtual {v1, v2}, Ljava/util/Random;->nextInt(I)I

    move-result v1

    if-ge v1, v0, :cond_1

    :goto_0
    iput-boolean v0, p0, Lcom/qihoo/security/ui/b/b;->j:Z

    .line 377
    iget-boolean v0, p0, Lcom/qihoo/security/ui/b/b;->j:Z

    if-eqz v0, :cond_0

    .line 378
    new-instance v0, Landroid/os/HandlerThread;

    const-string/jumbo v1, "FrameCounter"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 379
    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 380
    new-instance v1, Lcom/qihoo/security/ui/b/b$1;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, p0, v0}, Lcom/qihoo/security/ui/b/b$1;-><init>(Lcom/qihoo/security/ui/b/b;Landroid/os/Looper;)V

    iput-object v1, p0, Lcom/qihoo/security/ui/b/b;->m:Landroid/os/Handler;

    .line 401
    :cond_0
    return-void

    .line 376
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 163
    if-eqz p0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    sget v1, Lcom/qihoo/security/ui/b/b;->f:I

    if-ge v0, v1, :cond_2

    .line 164
    :cond_0
    if-nez p0, :cond_1

    const-string/jumbo v0, "null"

    .line 170
    :goto_0
    return-object v0

    .line 164
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 166
    :cond_2
    const-string/jumbo v0, ">>>>> Dispatching to Handler "

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "[\\{@]{1}[0-9a-z]+\\}?"

    const-string/jumbo v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "[\\(\\):]"

    const-string/jumbo v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 169
    :catch_0
    move-exception v0

    .line 170
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "!!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static a()V
    .locals 1

    .prologue
    .line 362
    sget-object v0, Lcom/qihoo/security/ui/b/b;->g:Lcom/qihoo/security/ui/b/b;

    invoke-direct {v0}, Lcom/qihoo/security/ui/b/b;->d()V

    .line 364
    return-void
.end method

.method public static a(I)V
    .locals 1

    .prologue
    .line 353
    if-gez p0, :cond_0

    .line 358
    :goto_0
    return-void

    .line 356
    :cond_0
    sget-object v0, Lcom/qihoo/security/ui/b/b;->g:Lcom/qihoo/security/ui/b/b;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/b/b;->d(I)V

    goto :goto_0
.end method

.method private a(II)V
    .locals 4

    .prologue
    .line 576
    monitor-enter p0

    .line 577
    :try_start_0
    iget v0, p0, Lcom/qihoo/security/ui/b/b;->h:I

    if-gez v0, :cond_1

    .line 578
    monitor-exit p0

    .line 593
    :cond_0
    :goto_0
    return-void

    .line 580
    :cond_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 581
    iget-object v0, p0, Lcom/qihoo/security/ui/b/b;->l:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/b/b$c;

    .line 582
    if-eqz v0, :cond_0

    .line 583
    iget-object v1, v0, Lcom/qihoo/security/ui/b/b$c;->d:Landroid/util/SparseArray;

    .line 584
    if-nez v1, :cond_2

    .line 585
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 586
    iput-object v1, v0, Lcom/qihoo/security/ui/b/b$c;->d:Landroid/util/SparseArray;

    .line 588
    :cond_2
    invoke-virtual {v1, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    .line 589
    if-nez v0, :cond_0

    .line 590
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v1, p2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_0

    .line 580
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private a(IILcom/qihoo/security/ui/b/b$a;)V
    .locals 22

    .prologue
    .line 405
    :try_start_0
    move-object/from16 v0, p3

    iget-object v2, v0, Lcom/qihoo/security/ui/b/b$a;->g:Ljava/util/List;

    .line 406
    if-nez v2, :cond_1

    .line 460
    :cond_0
    :goto_0
    return-void

    .line 409
    :cond_1
    const-wide v12, 0x7fffffffffffffffL

    .line 410
    const-wide/16 v10, 0x0

    .line 411
    const-wide/16 v8, 0x0

    .line 412
    const-wide/16 v4, 0x0

    .line 413
    const-string/jumbo v3, ""

    .line 415
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :cond_2
    :goto_1
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qihoo/security/ui/b/b$a$a;

    .line 416
    iget-wide v6, v2, Lcom/qihoo/security/ui/b/b$a$a;->b:J

    const-wide/16 v16, 0x0

    cmp-long v6, v6, v16

    if-lez v6, :cond_2

    .line 419
    iget-wide v6, v2, Lcom/qihoo/security/ui/b/b$a$a;->b:J

    iget-wide v0, v2, Lcom/qihoo/security/ui/b/b$a$a;->a:J

    move-wide/from16 v16, v0

    sub-long v6, v6, v16

    .line 420
    iget-wide v0, v2, Lcom/qihoo/security/ui/b/b$a$a;->c:J

    move-wide/from16 v16, v0

    const-wide/16 v18, 0x0

    cmp-long v15, v16, v18

    if-lez v15, :cond_4

    .line 421
    cmp-long v2, v6, v10

    if-lez v2, :cond_3

    move-wide v10, v6

    .line 424
    :cond_3
    cmp-long v2, v6, v12

    if-gez v2, :cond_8

    move-object v2, v3

    move-wide/from16 v20, v8

    move-wide v8, v10

    move-wide v10, v6

    move-wide/from16 v6, v20

    :goto_2
    move-object v3, v2

    move-wide v12, v10

    move-wide v10, v8

    move-wide v8, v6

    .line 434
    goto :goto_1

    .line 428
    :cond_4
    add-long/2addr v8, v6

    .line 429
    cmp-long v15, v6, v4

    if-lez v15, :cond_8

    .line 431
    iget-object v2, v2, Lcom/qihoo/security/ui/b/b$a$a;->d:Ljava/lang/String;

    move-wide v4, v6

    move-wide v6, v8

    move-wide v8, v10

    move-wide v10, v12

    goto :goto_2

    .line 436
    :cond_5
    const-wide v6, 0x7fffffffffffffffL

    cmp-long v2, v12, v6

    if-eqz v2, :cond_0

    const-wide/16 v6, 0x0

    cmp-long v2, v8, v6

    if-eqz v2, :cond_0

    const-wide/16 v6, 0x0

    cmp-long v2, v10, v6

    if-nez v2, :cond_6

    const-wide/16 v6, 0x0

    cmp-long v2, v4, v6

    if-eqz v2, :cond_0

    .line 441
    :cond_6
    if-eqz v3, :cond_7

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_7

    .line 442
    invoke-static {v3}, Lcom/qihoo/security/ui/b/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 444
    :cond_7
    const-string/jumbo v2, "%d:%d,fps:%d,dur:%d,min:%d,max:%d,Max:%d,%s,Total:%d"

    const/16 v6, 0x9

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    aput-object v14, v6, v7

    const/4 v7, 0x1

    move-object/from16 v0, p3

    iget v14, v0, Lcom/qihoo/security/ui/b/b$a;->a:I

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    aput-object v14, v6, v7

    const/4 v7, 0x2

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    aput-object v14, v6, v7

    const/4 v7, 0x3

    move-object/from16 v0, p3

    iget-wide v14, v0, Lcom/qihoo/security/ui/b/b$a;->c:J

    move-object/from16 v0, p3

    iget-wide v0, v0, Lcom/qihoo/security/ui/b/b$a;->b:J

    move-wide/from16 v16, v0

    sub-long v14, v14, v16

    const-wide/32 v16, 0xf4240

    div-long v14, v14, v16

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    aput-object v14, v6, v7

    const/4 v7, 0x4

    const-wide/32 v14, 0xf4240

    div-long/2addr v12, v14

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    aput-object v12, v6, v7

    const/4 v7, 0x5

    const-wide/32 v12, 0xf4240

    div-long/2addr v10, v12

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    aput-object v10, v6, v7

    const/4 v7, 0x6

    const-wide/32 v10, 0xf4240

    div-long/2addr v4, v10

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v6, v7

    const/4 v4, 0x7

    aput-object v3, v6, v4

    const/16 v3, 0x8

    const-wide/32 v4, 0xf4240

    div-long v4, v8, v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v6, v3

    invoke-static {v2, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 447
    const/16 v3, 0x4a9c

    const-string/jumbo v4, ""

    invoke-static {v3, v2, v4}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 454
    :catch_0
    move-exception v2

    .line 458
    const/16 v3, 0x4a9c

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "exc:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v4, ""

    invoke-static {v3, v2, v4}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_8
    move-object v2, v3

    move-wide v6, v8

    move-wide v8, v10

    move-wide v10, v12

    goto/16 :goto_2
.end method

.method public static a(ILandroid/view/View;)V
    .locals 1

    .prologue
    .line 597
    sget-object v0, Lcom/qihoo/security/ui/b/b;->g:Lcom/qihoo/security/ui/b/b;

    invoke-direct {v0, p0, p1}, Lcom/qihoo/security/ui/b/b;->b(ILandroid/view/View;)V

    .line 599
    return-void
.end method

.method public static a(ILandroid/view/View;Lcom/qihoo/security/ui/b/b$b;)V
    .locals 1

    .prologue
    .line 480
    sget-object v0, Lcom/qihoo/security/ui/b/b;->g:Lcom/qihoo/security/ui/b/b;

    invoke-direct {v0, p0, p1, p2}, Lcom/qihoo/security/ui/b/b;->b(ILandroid/view/View;Lcom/qihoo/security/ui/b/b$b;)V

    .line 482
    return-void
.end method

.method private a(IZ)V
    .locals 6

    .prologue
    .line 653
    monitor-enter p0

    .line 654
    :try_start_0
    iget v0, p0, Lcom/qihoo/security/ui/b/b;->h:I

    if-gez v0, :cond_1

    .line 655
    monitor-exit p0

    .line 677
    :cond_0
    :goto_0
    return-void

    .line 657
    :cond_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 659
    iget-object v0, p0, Lcom/qihoo/security/ui/b/b;->k:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/b/b$a;

    .line 660
    iget-object v1, p0, Lcom/qihoo/security/ui/b/b;->k:Landroid/util/SparseArray;

    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->remove(I)V

    .line 661
    if-eqz v0, :cond_0

    .line 662
    invoke-virtual {v0}, Lcom/qihoo/security/ui/b/b$a;->b()V

    .line 663
    invoke-virtual {v0}, Lcom/qihoo/security/ui/b/b$a;->a()I

    move-result v1

    .line 669
    iget-boolean v2, p0, Lcom/qihoo/security/ui/b/b;->j:Z

    if-eqz v2, :cond_2

    const/16 v2, 0x1e

    if-ge v1, v2, :cond_2

    .line 670
    iget-object v2, p0, Lcom/qihoo/security/ui/b/b;->m:Landroid/os/Handler;

    const/4 v3, 0x2

    iget v4, p0, Lcom/qihoo/security/ui/b/b;->h:I

    invoke-virtual {v2, v3, v4, v1, v0}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v2

    .line 672
    iget-object v3, p0, Lcom/qihoo/security/ui/b/b;->n:Ljava/util/Random;

    const/16 v4, 0x1388

    invoke-virtual {v3, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    add-int/lit16 v3, v3, 0x1f4

    int-to-long v4, v3

    .line 673
    iget-object v3, p0, Lcom/qihoo/security/ui/b/b;->m:Landroid/os/Handler;

    invoke-virtual {v3, v2, v4, v5}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 675
    :cond_2
    invoke-direct {p0, v0, v1}, Lcom/qihoo/security/ui/b/b;->a(Lcom/qihoo/security/ui/b/b$a;I)V

    goto :goto_0

    .line 657
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private a(Lcom/qihoo/security/ui/b/b$a;I)V
    .locals 2

    .prologue
    .line 644
    iget v0, p0, Lcom/qihoo/security/ui/b/b;->h:I

    iget v1, p1, Lcom/qihoo/security/ui/b/b$a;->a:I

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/b/b;->b(II)I

    move-result v0

    .line 645
    sget-object v1, Lcom/qihoo/security/ui/b/b;->d:Landroid/util/SparseIntArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseIntArray;->indexOfKey(I)I

    move-result v0

    .line 646
    if-ltz v0, :cond_0

    const/4 v1, -0x1

    if-eq p2, v1, :cond_0

    .line 647
    sget-object v1, Lcom/qihoo/security/ui/b/b;->d:Landroid/util/SparseIntArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseIntArray;->valueAt(I)I

    move-result v0

    .line 648
    invoke-static {v0, p2}, Lcom/qihoo/security/support/b;->b(II)V

    .line 650
    :cond_0
    return-void
.end method

.method private a(Lcom/qihoo/security/ui/b/b$c;)V
    .locals 11

    .prologue
    const/4 v10, 0x2

    const/4 v9, 0x1

    const/4 v3, 0x0

    .line 544
    const-string/jumbo v0, "    >>progress data for %d:%s"

    new-array v1, v10, [Ljava/lang/Object;

    iget v2, p0, Lcom/qihoo/security/ui/b/b;->i:I

    add-int/lit8 v4, v2, 0x1

    iput v4, p0, Lcom/qihoo/security/ui/b/b;->i:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v3

    sget-object v2, Lcom/qihoo/security/ui/b/b;->b:Landroid/util/SparseArray;

    iget v4, p1, Lcom/qihoo/security/ui/b/b$c;->a:I

    invoke-virtual {v2, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    aput-object v2, v1, v9

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/b/b;->b(Ljava/lang/String;)V

    .line 546
    iget-object v1, p1, Lcom/qihoo/security/ui/b/b$c;->d:Landroid/util/SparseArray;

    .line 547
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 548
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v5

    .line 550
    if-lez v5, :cond_2

    move v0, v3

    .line 552
    :goto_0
    if-ge v0, v5, :cond_0

    .line 553
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 552
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 555
    :cond_0
    invoke-static {v4}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 556
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 557
    add-int/lit8 v0, v5, -0x1

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v7

    move v2, v3

    move v1, v3

    .line 560
    :goto_1
    if-ge v2, v5, :cond_1

    .line 561
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 562
    if-lez v2, :cond_3

    .line 563
    add-int/lit8 v0, v2, -0x1

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sub-int v0, v8, v0

    .line 564
    if-le v0, v1, :cond_3

    .line 560
    :goto_2
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    move v1, v0

    goto :goto_1

    .line 569
    :cond_1
    const-string/jumbo v0, "    progress start:%d, end:%d, density: %.2f, max step: %d"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v9

    mul-int/lit8 v3, v5, 0x64

    int-to-float v3, v3

    sub-int v4, v7, v6

    add-int/lit8 v4, v4, 0x1

    int-to-float v4, v4

    div-float/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    aput-object v3, v2, v10

    const/4 v3, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v2, v3

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/b/b;->b(Ljava/lang/String;)V

    .line 573
    :cond_2
    return-void

    :cond_3
    move v0, v1

    goto :goto_2
.end method

.method static synthetic a(Lcom/qihoo/security/ui/b/b;I)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/b/b;->e(I)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/b/b;II)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/ui/b/b;->a(II)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/b/b;IILcom/qihoo/security/ui/b/b$a;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0, p1, p2, p3}, Lcom/qihoo/security/ui/b/b;->b(IILcom/qihoo/security/ui/b/b$a;)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/b/b;Lcom/qihoo/security/ui/b/b$c;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/b/b;->a(Lcom/qihoo/security/ui/b/b$c;)V

    return-void
.end method

.method private static b(II)I
    .locals 1

    .prologue
    .line 640
    shl-int/lit8 v0, p0, 0x10

    or-int/2addr v0, p1

    return v0
.end method

.method public static b(I)V
    .locals 1

    .prologue
    .line 511
    sget-object v0, Lcom/qihoo/security/ui/b/b;->g:Lcom/qihoo/security/ui/b/b;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/b/b;->e(I)V

    .line 513
    return-void
.end method

.method private b(IILcom/qihoo/security/ui/b/b$a;)V
    .locals 0

    .prologue
    .line 630
    return-void
.end method

.method private b(ILandroid/view/View;)V
    .locals 3

    .prologue
    .line 602
    monitor-enter p0

    .line 603
    :try_start_0
    iget v0, p0, Lcom/qihoo/security/ui/b/b;->h:I

    if-gez v0, :cond_1

    .line 604
    monitor-exit p0

    .line 624
    :cond_0
    :goto_0
    return-void

    .line 606
    :cond_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 607
    if-eqz p2, :cond_0

    .line 610
    invoke-virtual {p2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    .line 611
    if-eqz v1, :cond_0

    .line 614
    iget-object v0, p0, Lcom/qihoo/security/ui/b/b;->k:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/b/b$a;

    .line 615
    if-nez v0, :cond_0

    .line 621
    new-instance v0, Lcom/qihoo/security/ui/b/b$a;

    invoke-direct {v0, p1}, Lcom/qihoo/security/ui/b/b$a;-><init>(I)V

    .line 622
    iget-object v2, p0, Lcom/qihoo/security/ui/b/b;->k:Landroid/util/SparseArray;

    invoke-virtual {v2, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 623
    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/b$a;->a(Landroid/view/ViewTreeObserver;)V

    goto :goto_0

    .line 606
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private b(ILandroid/view/View;Lcom/qihoo/security/ui/b/b$b;)V
    .locals 3

    .prologue
    .line 485
    monitor-enter p0

    .line 486
    :try_start_0
    iget v0, p0, Lcom/qihoo/security/ui/b/b;->h:I

    if-gez v0, :cond_1

    .line 487
    monitor-exit p0

    .line 507
    :cond_0
    :goto_0
    return-void

    .line 489
    :cond_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 490
    if-eqz p3, :cond_0

    if-eqz p2, :cond_0

    .line 493
    invoke-virtual {p2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    .line 494
    if-eqz v1, :cond_0

    .line 497
    iget-object v0, p0, Lcom/qihoo/security/ui/b/b;->l:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/b/b$c;

    .line 498
    if-nez v0, :cond_0

    .line 504
    new-instance v0, Lcom/qihoo/security/ui/b/b$c;

    invoke-direct {v0, p1, p3}, Lcom/qihoo/security/ui/b/b$c;-><init>(ILcom/qihoo/security/ui/b/b$b;)V

    .line 505
    iget-object v2, p0, Lcom/qihoo/security/ui/b/b;->l:Landroid/util/SparseArray;

    invoke-virtual {v2, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 506
    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/b$c;->a(Landroid/view/ViewTreeObserver;)V

    goto :goto_0

    .line 489
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method static synthetic b(Lcom/qihoo/security/ui/b/b;IILcom/qihoo/security/ui/b/b$a;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0, p1, p2, p3}, Lcom/qihoo/security/ui/b/b;->a(IILcom/qihoo/security/ui/b/b$a;)V

    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 540
    return-void
.end method

.method static synthetic c()Lcom/qihoo/security/ui/b/b;
    .locals 1

    .prologue
    .line 25
    sget-object v0, Lcom/qihoo/security/ui/b/b;->g:Lcom/qihoo/security/ui/b/b;

    return-object v0
.end method

.method public static c(I)V
    .locals 2

    .prologue
    .line 635
    sget-object v0, Lcom/qihoo/security/ui/b/b;->g:Lcom/qihoo/security/ui/b/b;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lcom/qihoo/security/ui/b/b;->a(IZ)V

    .line 637
    return-void
.end method

.method private declared-synchronized d()V
    .locals 3

    .prologue
    .line 470
    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/qihoo/security/ui/b/b;->h:I

    if-ltz v0, :cond_0

    .line 471
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "end : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v0, Lcom/qihoo/security/ui/b/b;->a:Landroid/util/SparseArray;

    iget v2, p0, Lcom/qihoo/security/ui/b/b;->h:I

    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/b/b;->b(Ljava/lang/String;)V

    .line 473
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/b/b;->k:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 474
    iget-object v0, p0, Lcom/qihoo/security/ui/b/b;->l:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 475
    const/4 v0, -0x1

    iput v0, p0, Lcom/qihoo/security/ui/b/b;->h:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 476
    monitor-exit p0

    return-void

    .line 470
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized d(I)V
    .locals 2

    .prologue
    .line 463
    monitor-enter p0

    :try_start_0
    iput p1, p0, Lcom/qihoo/security/ui/b/b;->h:I

    .line 464
    iget-object v0, p0, Lcom/qihoo/security/ui/b/b;->k:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 465
    const/4 v0, 0x1

    iput v0, p0, Lcom/qihoo/security/ui/b/b;->i:I

    .line 466
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "anim for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v0, Lcom/qihoo/security/ui/b/b;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/b/b;->b(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 467
    monitor-exit p0

    return-void

    .line 463
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private e(I)V
    .locals 2

    .prologue
    .line 516
    monitor-enter p0

    .line 517
    :try_start_0
    iget v0, p0, Lcom/qihoo/security/ui/b/b;->h:I

    if-gez v0, :cond_1

    .line 518
    monitor-exit p0

    .line 530
    :cond_0
    :goto_0
    return-void

    .line 520
    :cond_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 521
    iget-object v0, p0, Lcom/qihoo/security/ui/b/b;->l:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/b/b$c;

    .line 522
    if-eqz v0, :cond_0

    .line 523
    iget-object v1, p0, Lcom/qihoo/security/ui/b/b;->l:Landroid/util/SparseArray;

    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->remove(I)V

    .line 524
    invoke-virtual {v0}, Lcom/qihoo/security/ui/b/b$c;->a()V

    goto :goto_0

    .line 520
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method public b()Z
    .locals 1

    .prologue
    .line 371
    iget-boolean v0, p0, Lcom/qihoo/security/ui/b/b;->j:Z

    return v0
.end method
