.class public final Lcom/roidapp/videolib/b/f;
.super Lcom/roidapp/videolib/b/c;
.source "SourceFile"


# static fields
.field public static final x:Lcom/roidapp/videolib/b/u;


# instance fields
.field protected A:[Lcom/roidapp/videolib/b/x;

.field private B:Ljp/co/cyberagent/android/a/s;

.field private C:Lcom/roidapp/videolib/b/k;

.field private D:[J

.field protected y:Ljp/co/cyberagent/android/a/r;

.field protected z:[Lcom/roidapp/videolib/b/x;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 16
    sget-object v0, Lcom/roidapp/videolib/b/u;->c:Lcom/roidapp/videolib/b/u;

    sput-object v0, Lcom/roidapp/videolib/b/f;->x:Lcom/roidapp/videolib/b/u;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 11

    .prologue
    .line 39
    invoke-direct {p0, p1}, Lcom/roidapp/videolib/b/c;-><init>(Landroid/content/Context;)V

    .line 18
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/videolib/b/f;->y:Ljp/co/cyberagent/android/a/r;

    .line 19
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/videolib/b/f;->z:[Lcom/roidapp/videolib/b/x;

    .line 20
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/videolib/b/f;->A:[Lcom/roidapp/videolib/b/x;

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/videolib/b/f;->C:Lcom/roidapp/videolib/b/k;

    .line 25
    const/4 v0, 0x3

    new-array v0, v0, [J

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/roidapp/videolib/b/f;->D:[J

    .line 40
    new-instance v0, Ljp/co/cyberagent/android/a/s;

    invoke-direct {v0}, Ljp/co/cyberagent/android/a/s;-><init>()V

    iput-object v0, p0, Lcom/roidapp/videolib/b/f;->B:Ljp/co/cyberagent/android/a/s;

    .line 43
    const/4 v0, 0x3

    new-array v6, v0, [Lcom/roidapp/videolib/b/l;

    const/4 v7, 0x0

    new-instance v0, Lcom/roidapp/videolib/b/l;

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x1b58

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/videolib/b/l;-><init>(IJJ)V

    aput-object v0, v6, v7

    const/4 v7, 0x1

    new-instance v0, Lcom/roidapp/videolib/b/l;

    const/4 v1, 0x1

    const-wide/16 v2, 0x1b58

    const-wide/16 v4, 0x2b5c

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/videolib/b/l;-><init>(IJJ)V

    aput-object v0, v6, v7

    const/4 v7, 0x2

    new-instance v0, Lcom/roidapp/videolib/b/l;

    const/4 v1, 0x2

    const-wide/16 v2, 0x2b5c

    const-wide/16 v4, 0x4e20

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/videolib/b/l;-><init>(IJJ)V

    aput-object v0, v6, v7

    iput-object v6, p0, Lcom/roidapp/videolib/b/f;->w:[Lcom/roidapp/videolib/b/l;

    .line 48
    const/4 v0, 0x3

    new-array v6, v0, [Lcom/roidapp/videolib/b/l;

    const/4 v7, 0x0

    new-instance v0, Lcom/roidapp/videolib/b/l;

    const/4 v1, 0x0

    const-wide/16 v2, 0x8ca

    const-wide/16 v4, 0xc8a

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/videolib/b/l;-><init>(IJJ)V

    aput-object v0, v6, v7

    const/4 v7, 0x1

    new-instance v0, Lcom/roidapp/videolib/b/l;

    const/4 v1, 0x1

    const-wide/16 v2, 0xc8a

    const-wide/16 v4, 0x19c7

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/videolib/b/l;-><init>(IJJ)V

    aput-object v0, v6, v7

    const/4 v7, 0x2

    new-instance v0, Lcom/roidapp/videolib/b/l;

    const/4 v1, 0x2

    const-wide/16 v2, 0x19c7

    const-wide/16 v4, 0x4e20

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/videolib/b/l;-><init>(IJJ)V

    aput-object v0, v6, v7

    iput-object v6, p0, Lcom/roidapp/videolib/b/f;->q:[Lcom/roidapp/videolib/b/l;

    .line 52
    const/16 v0, 0x5c

    new-array v10, v0, [Lcom/roidapp/videolib/b/x;

    const/4 v8, 0x0

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x960

    const-wide/16 v4, 0xc80

    const/high16 v6, 0x3f000000    # 0.5f

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/4 v0, 0x1

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x960

    const-wide/16 v4, 0xc80

    const v6, 0x40a33333    # 5.1f

    const v7, 0x40a33333    # 5.1f

    const v8, -0x436c8b44    # -0.018f

    const v9, 0x3f19999a    # 0.6f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/4 v8, 0x2

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x960

    const-wide/16 v4, 0xc80

    const/high16 v6, 0x3fc00000    # 1.5f

    const v7, 0x3f99999a    # 1.2f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/4 v8, 0x3

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x960

    const-wide/16 v4, 0xc80

    const v6, 0x3e051eb8    # 0.13f

    const v7, 0x3dcccccd    # 0.1f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/4 v8, 0x4

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0xc80

    const-wide/16 v4, 0xc8a

    const/high16 v6, 0x3f000000    # 0.5f

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/4 v0, 0x5

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0xc80

    const-wide/16 v4, 0xc8a

    const v6, 0x40a33333    # 5.1f

    const/high16 v7, 0x41100000    # 9.0f

    const v8, -0x436c8b44    # -0.018f

    const v9, 0x3f19999a    # 0.6f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/4 v8, 0x6

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0xc80

    const-wide/16 v4, 0xc8a

    const v6, 0x3f99999a    # 1.2f

    const v7, 0x3f86a7f0    # 1.052f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/4 v8, 0x7

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0xc80

    const-wide/16 v4, 0xc8a

    const v6, 0x3dcccccd    # 0.1f

    const v7, 0x3dcccccd    # 0.1f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x8

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0xc8a

    const-wide/16 v4, 0xe8b

    const/high16 v6, 0x3f000000    # 0.5f

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x9

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0xc8a

    const-wide/16 v4, 0xe8b

    const/high16 v6, 0x3f800000    # 1.0f

    const/high16 v7, 0x3f800000    # 1.0f

    const v8, 0x3c23d70a    # 0.01f

    const v9, 0x3ec39581    # 0.382f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0xa

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0xc8a

    const-wide/16 v4, 0xe8b

    const v6, 0x3fadd2f2    # 1.358f

    const v7, 0x3fa353f8    # 1.276f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0xb

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0xc8a

    const-wide/16 v4, 0xe8b

    const v6, 0x3dcccccd    # 0.1f

    const v7, 0x3dcccccd    # 0.1f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0xc

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0xe8b

    const-wide/16 v4, 0xe95

    const/high16 v6, 0x3f000000    # 0.5f

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0xd

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0xe8b

    const-wide/16 v4, 0xe95

    const/high16 v6, 0x3f800000    # 1.0f

    const/high16 v7, -0x3f600000    # -5.0f

    const v8, 0x3c23d70a    # 0.01f

    const v9, 0x3ec39581    # 0.382f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0xe

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0xe8b

    const-wide/16 v4, 0xe95

    const v6, 0x3fa353f8    # 1.276f

    const v7, 0x3fa353f8    # 1.276f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0xf

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0xe8b

    const-wide/16 v4, 0xe95

    const v6, 0x3dcccccd    # 0.1f

    const v7, 0x3dcccccd    # 0.1f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x10

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0xe95

    const-wide/16 v4, 0x1025

    const/high16 v6, 0x3f000000    # 0.5f

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x11

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0xe95

    const-wide/16 v4, 0x1025

    const/high16 v6, -0x3f600000    # -5.0f

    const/high16 v7, -0x3f600000    # -5.0f

    const v8, 0x3c23d70a    # 0.01f

    const v9, 0x3ec39581    # 0.382f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x12

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0xe95

    const-wide/16 v4, 0x1025

    const v6, 0x3fa353f8    # 1.276f

    const v7, 0x3fa353f8    # 1.276f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x13

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0xe95

    const-wide/16 v4, 0x1025

    const v6, 0x3dcccccd    # 0.1f

    const v7, 0x3dcccccd    # 0.1f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x14

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x1025

    const-wide/16 v4, 0x1130

    const/high16 v6, 0x3f000000    # 0.5f

    const v7, 0x3f19999a    # 0.6f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x15

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x1025

    const-wide/16 v4, 0x1130

    const/high16 v6, -0x3f600000    # -5.0f

    const/high16 v7, -0x3f600000    # -5.0f

    const v8, 0x3c23d70a    # 0.01f

    const v9, 0x3ec39581    # 0.382f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x16

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x1025

    const-wide/16 v4, 0x1130

    const v6, 0x3fa353f8    # 1.276f

    const v7, 0x3fcccccd    # 1.6f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x17

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x1025

    const-wide/16 v4, 0x1130

    const v6, 0x3dcccccd    # 0.1f

    const v7, 0x3e051eb8    # 0.13f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x18

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x18bd

    const-wide/16 v4, 0x1985

    const v6, 0x3f19999a    # 0.6f

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x19

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x18bd

    const-wide/16 v4, 0x1985

    const/high16 v6, -0x3f600000    # -5.0f

    const/high16 v7, -0x3f600000    # -5.0f

    const v8, 0x3c23d70a    # 0.01f

    const v9, 0x3ec39581    # 0.382f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x1a

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x18bd

    const-wide/16 v4, 0x1985

    const v6, 0x3fcccccd    # 1.6f

    const v7, 0x3fa353f8    # 1.276f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x1b

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x18bd

    const-wide/16 v4, 0x1985

    const v6, 0x3e051eb8    # 0.13f

    const v7, 0x3dcccccd    # 0.1f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x1c

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x1985

    const-wide/16 v4, 0x19c7

    const/high16 v6, 0x3f000000    # 0.5f

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x1d

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x1985

    const-wide/16 v4, 0x19c7

    const/high16 v6, -0x3f600000    # -5.0f

    const/high16 v7, 0x3f800000    # 1.0f

    const v8, 0x3c23d70a    # 0.01f

    const v9, 0x3ec39581    # 0.382f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x1e

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x1985

    const-wide/16 v4, 0x19c7

    const v6, 0x3fa353f8    # 1.276f

    const v7, 0x3fa353f8    # 1.276f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x1f

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x1985

    const-wide/16 v4, 0x19c7

    const v6, 0x3dcccccd    # 0.1f

    const v7, 0x3dcccccd    # 0.1f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x20

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x1ae3

    const-wide/16 v4, 0x1bc9

    const/high16 v6, 0x3f000000    # 0.5f

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x21

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x1ae3

    const-wide/16 v4, 0x1bc9

    const/high16 v6, 0x41100000    # 9.0f

    const/high16 v7, 0x41100000    # 9.0f

    const v8, 0x3fcccccd    # 1.6f

    const v9, 0x3ef5c28f    # 0.48f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x22

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x1ae3

    const-wide/16 v4, 0x1bc9

    const v6, 0x3fda9fbe    # 1.708f

    const v7, 0x3fa6e979    # 1.304f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x23

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x1ae3

    const-wide/16 v4, 0x1bc9

    const v6, 0x3de978d5    # 0.114f

    const v7, 0x3de978d5    # 0.114f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x24

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x1bc9

    const-wide/16 v4, 0x1bdd

    const/high16 v6, 0x3f000000    # 0.5f

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x25

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x1bc9

    const-wide/16 v4, 0x1bdd

    const/high16 v6, 0x41100000    # 9.0f

    const/high16 v7, 0x40e00000    # 7.0f

    const v8, -0x42f4bc6a    # -0.034f

    const v9, 0x3ec08312    # 0.376f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x26

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x1bc9

    const-wide/16 v4, 0x1bdd

    const v6, 0x3fa6e979    # 1.304f

    const v7, 0x3fa6e979    # 1.304f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x27

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x1bc9

    const-wide/16 v4, 0x1bdd

    const v6, 0x3de978d5    # 0.114f

    const v7, 0x3de978d5    # 0.114f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x28

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x1bdd

    const-wide/16 v4, 0x1daf

    const/high16 v6, 0x3f000000    # 0.5f

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x29

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x1bdd

    const-wide/16 v4, 0x1daf

    const/high16 v6, 0x40e00000    # 7.0f

    const/high16 v7, 0x40e00000    # 7.0f

    const v8, -0x42f4bc6a    # -0.034f

    const v9, 0x3ec08312    # 0.376f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x2a

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x1bdd

    const-wide/16 v4, 0x1daf

    const v6, 0x3fa6e979    # 1.304f

    const v7, 0x3fa6e979    # 1.304f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x2b

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x1bdd

    const-wide/16 v4, 0x1daf

    const v6, 0x3de978d5    # 0.114f

    const v7, 0x3de978d5    # 0.114f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x2c

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x1daf

    const-wide/16 v4, 0x1e77

    const/high16 v6, 0x3f000000    # 0.5f

    const v7, 0x3f19999a    # 0.6f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x2d

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x1daf

    const-wide/16 v4, 0x1e77

    const/high16 v6, 0x40e00000    # 7.0f

    const/high16 v7, 0x40e00000    # 7.0f

    const v8, -0x42f4bc6a    # -0.034f

    const v9, 0x3ec08312    # 0.376f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x2e

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x1daf

    const-wide/16 v4, 0x1e77

    const v6, 0x3fa6e979    # 1.304f

    const v7, 0x3fcccccd    # 1.6f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x2f

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x1daf

    const-wide/16 v4, 0x1e77

    const v6, 0x3de978d5    # 0.114f

    const v7, 0x3de978d5    # 0.114f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x30

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x1e77

    const-wide/16 v4, 0x2647

    const v6, 0x3f19999a    # 0.6f

    const v7, 0x3f19999a    # 0.6f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x31

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x1e77

    const-wide/16 v4, 0x2647

    const/high16 v6, 0x40e00000    # 7.0f

    const/high16 v7, 0x40e00000    # 7.0f

    const v8, -0x42f4bc6a    # -0.034f

    const v9, 0x3ec08312    # 0.376f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x32

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x1e77

    const-wide/16 v4, 0x2647

    const v6, 0x3fcccccd    # 1.6f

    const v7, 0x3fcccccd    # 1.6f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x33

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x1e77

    const-wide/16 v4, 0x2647

    const v6, 0x3de978d5    # 0.114f

    const v7, 0x3de978d5    # 0.114f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x34

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x2647

    const-wide/16 v4, 0x2752

    const v6, 0x3f19999a    # 0.6f

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x35

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x2647

    const-wide/16 v4, 0x2752

    const/high16 v6, 0x40e00000    # 7.0f

    const/high16 v7, 0x40e00000    # 7.0f

    const v8, -0x42f4bc6a    # -0.034f

    const v9, 0x3ec08312    # 0.376f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x36

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x2647

    const-wide/16 v4, 0x2752

    const v6, 0x3fcccccd    # 1.6f

    const v7, 0x3f970a3d    # 1.18f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x37

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x2647

    const-wide/16 v4, 0x2752

    const v6, 0x3de978d5    # 0.114f

    const v7, 0x3de978d5    # 0.114f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x38

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x2752

    const-wide/16 v4, 0x289f

    const/high16 v6, 0x3f000000    # 0.5f

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x39

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x2752

    const-wide/16 v4, 0x289f

    const/high16 v6, 0x40e00000    # 7.0f

    const/high16 v7, 0x40e00000    # 7.0f

    const v8, -0x42f4bc6a    # -0.034f

    const v9, 0x3ec08312    # 0.376f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x3a

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x2752

    const-wide/16 v4, 0x289f

    const v6, 0x3f970a3d    # 1.18f

    const v7, 0x3f970a3d    # 1.18f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x3b

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x2752

    const-wide/16 v4, 0x289f

    const v6, 0x3de978d5    # 0.114f

    const v7, 0x3de978d5    # 0.114f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x3c

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x289f

    const-wide/16 v4, 0x28b3

    const/high16 v6, 0x3f000000    # 0.5f

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x3d

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x289f

    const-wide/16 v4, 0x28b3

    const/high16 v6, 0x41100000    # 9.0f

    const/high16 v7, 0x41100000    # 9.0f

    const v8, -0x42f4bc6a    # -0.034f

    const v9, 0x3ec08312    # 0.376f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x3e

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x289f

    const-wide/16 v4, 0x28b3

    const v6, 0x3f970a3d    # 1.18f

    const v7, 0x3f970a3d    # 1.18f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x3f

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x289f

    const-wide/16 v4, 0x28b3

    const v6, 0x3de978d5    # 0.114f

    const v7, 0x3de978d5    # 0.114f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x40

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x28b3

    const-wide/16 v4, 0x2ba1

    const/high16 v6, 0x3f000000    # 0.5f

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x41

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x28b3

    const-wide/16 v4, 0x2ba1

    const/high16 v6, 0x41100000    # 9.0f

    const/high16 v7, 0x41100000    # 9.0f

    const v8, -0x42f4bc6a    # -0.034f

    const v9, 0x3ec08312    # 0.376f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x42

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x28b3

    const-wide/16 v4, 0x2ba1

    const v6, 0x3f970a3d    # 1.18f

    const v7, 0x3ca3d70a    # 0.02f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x43

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x28b3

    const-wide/16 v4, 0x2ba1

    const v6, 0x3de978d5    # 0.114f

    const v7, 0x3de978d5    # 0.114f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x44

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x2ba1

    const-wide/16 v4, 0x2bb5

    const/high16 v6, 0x3f000000    # 0.5f

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x45

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x2ba1

    const-wide/16 v4, 0x2bb5

    const/high16 v6, 0x41100000    # 9.0f

    const/high16 v7, 0x40e00000    # 7.0f

    const v8, -0x42f4bc6a    # -0.034f

    const v9, 0x3ec08312    # 0.376f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x46

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x2ba1

    const-wide/16 v4, 0x2bb5

    const v6, 0x3ca3d70a    # 0.02f

    const v7, 0x3ca3d70a    # 0.02f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x47

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x2ba1

    const-wide/16 v4, 0x2bb5

    const v6, 0x3de978d5    # 0.114f

    const v7, 0x3de978d5    # 0.114f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x48

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x2bb5

    const-wide/16 v4, 0x2c02

    const/high16 v6, 0x3f000000    # 0.5f

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x49

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x2bb5

    const-wide/16 v4, 0x2c02

    const/high16 v6, 0x40e00000    # 7.0f

    const/high16 v7, 0x40e00000    # 7.0f

    const v8, -0x42f4bc6a    # -0.034f

    const v9, 0x3ec08312    # 0.376f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x4a

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x2bb5

    const-wide/16 v4, 0x2c02

    const v6, 0x3ca3d70a    # 0.02f

    const v7, 0x3ca3d70a    # 0.02f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x4b

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x2bb5

    const-wide/16 v4, 0x2c02

    const v6, 0x3de978d5    # 0.114f

    const v7, 0x3de978d5    # 0.114f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x4c

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x2c02

    const-wide/16 v4, 0x2dd5

    const/high16 v6, 0x3f000000    # 0.5f

    const v7, 0x3f19999a    # 0.6f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x4d

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x2c02

    const-wide/16 v4, 0x2dd5

    const/high16 v6, 0x40e00000    # 7.0f

    const/high16 v7, 0x40e00000    # 7.0f

    const v8, -0x42f4bc6a    # -0.034f

    const v9, 0x3ec08312    # 0.376f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x4e

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x2c02

    const-wide/16 v4, 0x2dd5

    const v6, 0x3ca3d70a    # 0.02f

    const v7, 0x3ca3d70a    # 0.02f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x4f

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x2c02

    const-wide/16 v4, 0x2dd5

    const v6, 0x3de978d5    # 0.114f

    const v7, 0x3de978d5    # 0.114f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x50

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x2dd5

    const-wide/16 v4, 0x33ea

    const v6, 0x3f19999a    # 0.6f

    const v7, 0x3f19999a    # 0.6f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x51

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x2dd5

    const-wide/16 v4, 0x33ea

    const/high16 v6, 0x40e00000    # 7.0f

    const/high16 v7, 0x40e00000    # 7.0f

    const v8, -0x42f4bc6a    # -0.034f

    const v9, 0x3ec08312    # 0.376f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x52

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x2dd5

    const-wide/16 v4, 0x33ea

    const v6, 0x3ca3d70a    # 0.02f

    const v7, 0x3ca3d70a    # 0.02f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x53

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x2dd5

    const-wide/16 v4, 0x33ea

    const v6, 0x3de978d5    # 0.114f

    const v7, 0x3de978d5    # 0.114f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x54

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x33ea

    const-wide/16 v4, 0x37dc

    const v6, 0x3f19999a    # 0.6f

    const v7, 0x3f2e147b    # 0.68f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x55

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x33ea

    const-wide/16 v4, 0x37dc

    const/high16 v6, 0x40e00000    # 7.0f

    const/4 v7, 0x0

    const v8, -0x42f4bc6a    # -0.034f

    const v9, 0x3ec08312    # 0.376f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x56

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x33ea

    const-wide/16 v4, 0x37dc

    const v6, 0x3ca3d70a    # 0.02f

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x57

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x33ea

    const-wide/16 v4, 0x37dc

    const v6, 0x3de978d5    # 0.114f

    const v7, 0x3de978d5    # 0.114f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x58

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x37dc

    const-wide/16 v4, 0x4e20

    const v6, 0x3f2e147b    # 0.68f

    const v7, 0x3f2e147b    # 0.68f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x59

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x37dc

    const-wide/16 v4, 0x4e20

    const/4 v6, 0x0

    const/4 v7, 0x0

    const v8, -0x42f4bc6a    # -0.034f

    const v9, 0x3ec08312    # 0.376f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x5a

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x37dc

    const-wide/16 v4, 0x4e20

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x5b

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x37dc

    const-wide/16 v4, 0x4e20

    const v6, 0x3de978d5    # 0.114f

    const v7, 0x3de978d5    # 0.114f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    iput-object v10, p0, Lcom/roidapp/videolib/b/f;->p:[Lcom/roidapp/videolib/b/x;

    .line 424
    const/16 v0, 0x50

    new-array v10, v0, [Lcom/roidapp/videolib/b/x;

    const/4 v8, 0x0

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0xc8a

    const-wide/16 v4, 0xe81

    const/high16 v6, 0x3f000000    # 0.5f

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/4 v0, 0x1

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0xc8a

    const-wide/16 v4, 0xe81

    const/high16 v6, 0x41100000    # 9.0f

    const/high16 v7, 0x41100000    # 9.0f

    const v8, -0x435c28f6    # -0.02f

    const/high16 v9, 0x3f000000    # 0.5f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/4 v8, 0x2

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0xc8a

    const-wide/16 v4, 0xe81

    const v6, 0x3f86a7f0    # 1.052f

    const v7, -0x435c28f6    # -0.02f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/4 v8, 0x3

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0xc8a

    const-wide/16 v4, 0xe81

    const v6, 0x3dcccccd    # 0.1f

    const v7, 0x3dcccccd    # 0.1f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/4 v8, 0x4

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0xe81

    const-wide/16 v4, 0xe8b

    const/high16 v6, 0x3f000000    # 0.5f

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/4 v0, 0x5

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0xe81

    const-wide/16 v4, 0xe8b

    const/high16 v6, 0x41100000    # 9.0f

    const/high16 v7, 0x40a00000    # 5.0f

    const v8, -0x435c28f6    # -0.02f

    const/high16 v9, 0x3f000000    # 0.5f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/4 v8, 0x6

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0xe81

    const-wide/16 v4, 0xe8b

    const v6, -0x435c28f6    # -0.02f

    const v7, -0x435c28f6    # -0.02f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/4 v8, 0x7

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0xe81

    const-wide/16 v4, 0xe8b

    const v6, 0x3dcccccd    # 0.1f

    const v7, 0x3dcccccd    # 0.1f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x8

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0xe8b

    const-wide/16 v4, 0x1025

    const/high16 v6, 0x3f000000    # 0.5f

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x9

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0xe8b

    const-wide/16 v4, 0x1025

    const/high16 v6, 0x40a00000    # 5.0f

    const/high16 v7, 0x40a00000    # 5.0f

    const v8, -0x435c28f6    # -0.02f

    const/high16 v9, 0x3f000000    # 0.5f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0xa

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0xe8b

    const-wide/16 v4, 0x1025

    const v6, -0x435c28f6    # -0.02f

    const v7, -0x435c28f6    # -0.02f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0xb

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0xe8b

    const-wide/16 v4, 0x1025

    const v6, 0x3dcccccd    # 0.1f

    const v7, 0x3dcccccd    # 0.1f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0xc

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x1025

    const-wide/16 v4, 0x11b5

    const/high16 v6, 0x3f000000    # 0.5f

    const v7, 0x3f19999a    # 0.6f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0xd

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x1025

    const-wide/16 v4, 0x11b5

    const/high16 v6, 0x40a00000    # 5.0f

    const/high16 v7, 0x40a00000    # 5.0f

    const v8, -0x435c28f6    # -0.02f

    const/high16 v9, 0x3f000000    # 0.5f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0xe

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x1025

    const-wide/16 v4, 0x11b5

    const v6, -0x435c28f6    # -0.02f

    const v7, -0x435c28f6    # -0.02f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0xf

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x1025

    const-wide/16 v4, 0x11b5

    const v6, 0x3dcccccd    # 0.1f

    const v7, 0x3dcccccd    # 0.1f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x10

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x11b5

    const-wide/16 v4, 0x1837

    const v6, 0x3f19999a    # 0.6f

    const v7, 0x3f19999a    # 0.6f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x11

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x11b5

    const-wide/16 v4, 0x1837

    const/high16 v6, 0x40a00000    # 5.0f

    const/high16 v7, 0x40a00000    # 5.0f

    const v8, -0x435c28f6    # -0.02f

    const/high16 v9, 0x3f000000    # 0.5f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x12

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x11b5

    const-wide/16 v4, 0x1837

    const v6, -0x435c28f6    # -0.02f

    const v7, -0x435c28f6    # -0.02f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x13

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x11b5

    const-wide/16 v4, 0x1837

    const v6, 0x3dcccccd    # 0.1f

    const v7, 0x3dcccccd    # 0.1f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x14

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x1837

    const-wide/16 v4, 0x19a9

    const v6, 0x3f19999a    # 0.6f

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x15

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x1837

    const-wide/16 v4, 0x19a9

    const/high16 v6, 0x40a00000    # 5.0f

    const/high16 v7, 0x40a00000    # 5.0f

    const v8, -0x435c28f6    # -0.02f

    const/high16 v9, 0x3f000000    # 0.5f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x16

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x1837

    const-wide/16 v4, 0x19a9

    const v6, -0x435c28f6    # -0.02f

    const v7, -0x435c28f6    # -0.02f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x17

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x1837

    const-wide/16 v4, 0x19a9

    const v6, 0x3dcccccd    # 0.1f

    const v7, 0x3dcccccd    # 0.1f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x18

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x19a9

    const-wide/16 v4, 0x19bd

    const/high16 v6, 0x3f000000    # 0.5f

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x19

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x19a9

    const-wide/16 v4, 0x19bd

    const/high16 v6, 0x40a00000    # 5.0f

    const/high16 v7, 0x41100000    # 9.0f

    const v8, 0x3c23d70a    # 0.01f

    const v9, 0x3ec39581    # 0.382f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x1a

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x19a9

    const-wide/16 v4, 0x19bd

    const v6, -0x435c28f6    # -0.02f

    const v7, -0x435c28f6    # -0.02f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x1b

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x19a9

    const-wide/16 v4, 0x19bd

    const v6, 0x3dcccccd    # 0.1f

    const v7, 0x3dcccccd    # 0.1f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x1c

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x19bd

    const-wide/16 v4, 0x19c7

    const/high16 v6, 0x3f000000    # 0.5f

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x1d

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x19a9

    const-wide/16 v4, 0x19c7

    const/high16 v6, 0x40a00000    # 5.0f

    const/high16 v7, 0x41100000    # 9.0f

    const v8, 0x3c23d70a    # 0.01f

    const v9, 0x3ec39581    # 0.382f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x1e

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x19bd

    const-wide/16 v4, 0x19c7

    const v6, -0x435c28f6    # -0.02f

    const v7, -0x435c28f6    # -0.02f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x1f

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x19bd

    const-wide/16 v4, 0x19c7

    const v6, 0x3dcccccd    # 0.1f

    const v7, 0x3dcccccd    # 0.1f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x20

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x19c7

    const-wide/16 v4, 0x1b9a

    const/high16 v6, 0x3f000000    # 0.5f

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x21

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x19c7

    const-wide/16 v4, 0x1b9a

    const/high16 v6, 0x3f800000    # 1.0f

    const/high16 v7, 0x3f800000    # 1.0f

    const v8, 0x3c23d70a    # 0.01f

    const v9, 0x3ec39581    # 0.382f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x22

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x19c7

    const-wide/16 v4, 0x1b9a

    const v6, 0x3fa3d70a    # 1.28f

    const v7, -0x438a3d71    # -0.015f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x23

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x19c7

    const-wide/16 v4, 0x1b9a

    const v6, 0x3d8f5c29    # 0.07f

    const v7, 0x3d8f5c29    # 0.07f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x24

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x1b9a

    const-wide/16 v4, 0x1c12

    const/high16 v6, 0x3f000000    # 0.5f

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x25

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x1b9a

    const-wide/16 v4, 0x1c12

    const/high16 v6, 0x3f800000    # 1.0f

    const/high16 v7, -0x3f600000    # -5.0f

    const v8, 0x3c23d70a    # 0.01f

    const v9, 0x3ec39581    # 0.382f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x26

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x1b9a

    const-wide/16 v4, 0x1c12

    const v6, -0x438a3d71    # -0.015f

    const v7, -0x436c8b44    # -0.018f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x27

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x1b9a

    const-wide/16 v4, 0x1c12

    const v6, 0x3d8f5c29    # 0.07f

    const v7, 0x3d8f5c29    # 0.07f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x28

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x1c12

    const-wide/16 v4, 0x1daf

    const/high16 v6, 0x3f000000    # 0.5f

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x29

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x1c12

    const-wide/16 v4, 0x1daf

    const/high16 v6, -0x3f600000    # -5.0f

    const/high16 v7, -0x3f600000    # -5.0f

    const v8, 0x3fdba5e3    # 1.716f

    const v9, 0x3ef5c28f    # 0.48f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x2a

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x1c12

    const-wide/16 v4, 0x1daf

    const v6, -0x436c8b44    # -0.018f

    const v7, -0x436c8b44    # -0.018f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x2b

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x1c12

    const-wide/16 v4, 0x1daf

    const v6, 0x3d8f5c29    # 0.07f

    const v7, 0x3d8f5c29    # 0.07f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x2c

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x1daf

    const-wide/16 v4, 0x1f3f

    const/high16 v6, 0x3f000000    # 0.5f

    const v7, 0x3f19999a    # 0.6f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x2d

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x1daf

    const-wide/16 v4, 0x1f3f

    const/high16 v6, -0x3f600000    # -5.0f

    const/high16 v7, -0x3f600000    # -5.0f

    const v8, 0x3c23d70a    # 0.01f

    const v9, 0x3ec39581    # 0.382f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x2e

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x1daf

    const-wide/16 v4, 0x1f3f

    const v6, -0x436c8b44    # -0.018f

    const v7, -0x436c8b44    # -0.018f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x2f

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x1daf

    const-wide/16 v4, 0x1f3f

    const v6, 0x3d8f5c29    # 0.07f

    const v7, 0x3e072b02    # 0.132f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x30

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x1f3f

    const-wide/16 v4, 0x25c2

    const v6, 0x3f19999a    # 0.6f

    const v7, 0x3f19999a    # 0.6f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x31

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x1f3f

    const-wide/16 v4, 0x25c2

    const/high16 v6, -0x3f600000    # -5.0f

    const/high16 v7, -0x3f600000    # -5.0f

    const v8, 0x3c23d70a    # 0.01f

    const v9, 0x3ec39581    # 0.382f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x32

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x1f3f

    const-wide/16 v4, 0x25c2

    const v6, -0x436c8b44    # -0.018f

    const v7, -0x436c8b44    # -0.018f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x33

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x1f3f

    const-wide/16 v4, 0x25c2

    const v6, 0x3e072b02    # 0.132f

    const v7, 0x3e072b02    # 0.132f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x34

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x25c2

    const-wide/16 v4, 0x2752

    const v6, 0x3f19999a    # 0.6f

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x35

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x25c2

    const-wide/16 v4, 0x2752

    const/high16 v6, -0x3f600000    # -5.0f

    const/high16 v7, -0x3f600000    # -5.0f

    const v8, 0x3c23d70a    # 0.01f

    const v9, 0x3ec39581    # 0.382f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x36

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x25c2

    const-wide/16 v4, 0x2752

    const v6, -0x436c8b44    # -0.018f

    const v7, -0x436c8b44    # -0.018f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x37

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x25c2

    const-wide/16 v4, 0x2752

    const v6, 0x3e072b02    # 0.132f

    const v7, 0x3db851ec    # 0.09f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x38

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x2752

    const-wide/16 v4, 0x289f

    const/high16 v6, 0x3f000000    # 0.5f

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x39

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x2752

    const-wide/16 v4, 0x289f

    const/high16 v6, -0x3f600000    # -5.0f

    const/high16 v7, -0x3f600000    # -5.0f

    const v8, 0x3c23d70a    # 0.01f

    const v9, 0x3ec39581    # 0.382f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x3a

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x2752

    const-wide/16 v4, 0x289f

    const v6, -0x436c8b44    # -0.018f

    const v7, -0x436c8b44    # -0.018f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x3b

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x2752

    const-wide/16 v4, 0x289f

    const v6, 0x3db851ec    # 0.09f

    const v7, 0x3db851ec    # 0.09f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x3c

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x289f

    const-wide/16 v4, 0x28e2

    const/high16 v6, 0x3f000000    # 0.5f

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x3d

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x289f

    const-wide/16 v4, 0x28e2

    const/high16 v6, -0x3f600000    # -5.0f

    const/high16 v7, 0x3f800000    # 1.0f

    const v8, 0x3c23d70a    # 0.01f

    const v9, 0x3ec39581    # 0.382f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x3e

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x289f

    const-wide/16 v4, 0x28e2

    const v6, -0x436c8b44    # -0.018f

    const v7, -0x436c8b44    # -0.018f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x3f

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x289f

    const-wide/16 v4, 0x28e2

    const v6, 0x3db851ec    # 0.09f

    const v7, 0x3db851ec    # 0.09f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x40

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x28e2

    const-wide/16 v4, 0x2b7d

    const/high16 v6, 0x3f000000    # 0.5f

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x41

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x28e2

    const-wide/16 v4, 0x2b7d

    const/high16 v6, 0x3f800000    # 1.0f

    const/high16 v7, 0x3f800000    # 1.0f

    const v8, 0x3c23d70a    # 0.01f

    const v9, 0x3ec39581    # 0.382f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x42

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x28e2

    const-wide/16 v4, 0x2b7d

    const v6, -0x436c8b44    # -0.018f

    const v7, -0x405e353f    # -1.264f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x43

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x28e2

    const-wide/16 v4, 0x2b7d

    const v6, 0x3db851ec    # 0.09f

    const v7, 0x3db851ec    # 0.09f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x44

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x2b7d

    const-wide/16 v4, 0x2bbf

    const/high16 v6, 0x3f000000    # 0.5f

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x45

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x2b7d

    const-wide/16 v4, 0x2bbf

    const/high16 v6, 0x3f800000    # 1.0f

    const/high16 v7, -0x3f600000    # -5.0f

    const v8, 0x3c23d70a    # 0.01f

    const v9, 0x3ec39581    # 0.382f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x46

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x2b7d

    const-wide/16 v4, 0x2bbf

    const v6, -0x405eb852    # -1.26f

    const v7, -0x405eb852    # -1.26f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x47

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x2b7d

    const-wide/16 v4, 0x2bbf

    const v6, 0x3dc8b439

    const v7, 0x3dc8b439

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x48

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x2bbf

    const-wide/16 v4, 0x2c02

    const/high16 v6, 0x3f000000    # 0.5f

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x49

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x2bbf

    const-wide/16 v4, 0x2c02

    const/high16 v6, 0x3f800000    # 1.0f

    const/high16 v7, -0x3f600000    # -5.0f

    const v8, 0x3c23d70a    # 0.01f

    const v9, 0x3ec39581    # 0.382f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x4a

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x2bbf

    const-wide/16 v4, 0x2c02

    const v6, -0x405eb852    # -1.26f

    const v7, -0x405eb852    # -1.26f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x4b

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x2bbf

    const-wide/16 v4, 0x2c02

    const v6, 0x3dc8b439

    const v7, 0x3dc8b439

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x4c

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x2c02

    const-wide/16 v4, 0x2dd5

    const/high16 v6, 0x3f000000    # 0.5f

    const v7, 0x3f19999a    # 0.6f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x4d

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x2c02

    const-wide/16 v4, 0x2dd5

    const/high16 v6, -0x3f600000    # -5.0f

    const/high16 v7, -0x3f600000    # -5.0f

    const v8, 0x3c23d70a    # 0.01f

    const v9, 0x3ec39581    # 0.382f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x4e

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x2c02

    const-wide/16 v4, 0x2dd5

    const v6, -0x405eb852    # -1.26f

    const v7, -0x40266666    # -1.7f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x4f

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x2c02

    const-wide/16 v4, 0x2dd5

    const v6, 0x3dc8b439

    const v7, 0x3e0b4396    # 0.136f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    iput-object v10, p0, Lcom/roidapp/videolib/b/f;->z:[Lcom/roidapp/videolib/b/x;

    .line 730
    const/16 v0, 0x24

    new-array v10, v0, [Lcom/roidapp/videolib/b/x;

    const/4 v8, 0x0

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x19c7

    const-wide/16 v4, 0x1b9a

    const/high16 v6, 0x3f000000    # 0.5f

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/4 v0, 0x1

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x19c7

    const-wide/16 v4, 0x1b9a

    const/high16 v6, 0x41100000    # 9.0f

    const/high16 v7, 0x41100000    # 9.0f

    const v8, -0x435c28f6    # -0.02f

    const v9, 0x3f039581    # 0.514f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/4 v8, 0x2

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x19c7

    const-wide/16 v4, 0x1b9a

    const v6, -0x435c28f6    # -0.02f

    const v7, -0x405b22d1    # -1.288f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/4 v8, 0x3

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x19c7

    const-wide/16 v4, 0x1b9a

    const v6, 0x3dcccccd    # 0.1f

    const v7, 0x3dcccccd    # 0.1f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/4 v8, 0x4

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x1b9a

    const-wide/16 v4, 0x1bdd

    const/high16 v6, 0x3f000000    # 0.5f

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/4 v0, 0x5

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x1b9a

    const-wide/16 v4, 0x1bdd

    const/high16 v6, 0x41100000    # 9.0f

    const/high16 v7, 0x41100000    # 9.0f

    const v8, -0x435c28f6    # -0.02f

    const v9, 0x3f039581    # 0.514f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/4 v8, 0x6

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x1b9a

    const-wide/16 v4, 0x1bdd

    const v6, -0x405b22d1    # -1.288f

    const v7, -0x405b22d1    # -1.288f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/4 v8, 0x7

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x1b9a

    const-wide/16 v4, 0x1bdd

    const v6, 0x3dcccccd    # 0.1f

    const v7, 0x3dcccccd    # 0.1f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x8

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x1bdd

    const-wide/16 v4, 0x1daf

    const/high16 v6, 0x3f000000    # 0.5f

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x9

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x1bdd

    const-wide/16 v4, 0x1daf

    const/high16 v6, 0x41100000    # 9.0f

    const/high16 v7, 0x41100000    # 9.0f

    const v8, -0x435c28f6    # -0.02f

    const v9, 0x3f039581    # 0.514f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0xa

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x1bdd

    const-wide/16 v4, 0x1daf

    const v6, -0x405b22d1    # -1.288f

    const v7, -0x405b22d1    # -1.288f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0xb

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x1bdd

    const-wide/16 v4, 0x1daf

    const v6, 0x3dd4fdf4    # 0.104f

    const v7, 0x3dd4fdf4    # 0.104f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0xc

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x1daf

    const-wide/16 v4, 0x1e35

    const/high16 v6, 0x3f000000    # 0.5f

    const v7, 0x3f19999a    # 0.6f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0xd

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x1daf

    const-wide/16 v4, 0x1e35

    const/high16 v6, 0x41100000    # 9.0f

    const/high16 v7, 0x41100000    # 9.0f

    const v8, -0x435c28f6    # -0.02f

    const v9, 0x3f039581    # 0.514f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0xe

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x1daf

    const-wide/16 v4, 0x1e35

    const v6, -0x405b22d1    # -1.288f

    const v7, -0x405b22d1    # -1.288f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0xf

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x1daf

    const-wide/16 v4, 0x1e35

    const v6, 0x3dd4fdf4    # 0.104f

    const v7, 0x3dd4fdf4    # 0.104f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x10

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x1daf

    const-wide/16 v4, 0x23f0

    const v6, 0x3f19999a    # 0.6f

    const v7, 0x3f19999a    # 0.6f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x11

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x1daf

    const-wide/16 v4, 0x23f0

    const/high16 v6, 0x41100000    # 9.0f

    const/high16 v7, 0x41100000    # 9.0f

    const v8, -0x435c28f6    # -0.02f

    const v9, 0x3f039581    # 0.514f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x12

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x1daf

    const-wide/16 v4, 0x23f0

    const v6, -0x405b22d1    # -1.288f

    const v7, -0x4053f7cf    # -1.344f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x13

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x1daf

    const-wide/16 v4, 0x23f0

    const v6, 0x3dd4fdf4    # 0.104f

    const v7, 0x3dd4fdf4    # 0.104f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x14

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x23f0

    const-wide/16 v4, 0x2724

    const v6, 0x3f19999a    # 0.6f

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x15

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x23f0

    const-wide/16 v4, 0x2724

    const/high16 v6, 0x41100000    # 9.0f

    const/high16 v7, 0x41100000    # 9.0f

    const v8, -0x435c28f6    # -0.02f

    const v9, 0x3f039581    # 0.514f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x16

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x23f0

    const-wide/16 v4, 0x2724

    const v6, -0x4053f7cf    # -1.344f

    const v7, -0x4053f7cf    # -1.344f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x17

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x23f0

    const-wide/16 v4, 0x2724

    const v6, 0x3dd4fdf4    # 0.104f

    const v7, 0x3dcccccd    # 0.1f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x18

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x2724

    const-wide/16 v4, 0x2792

    const/high16 v6, 0x3f000000    # 0.5f

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x19

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x2724

    const-wide/16 v4, 0x2792

    const/high16 v6, 0x41100000    # 9.0f

    const/high16 v7, 0x41100000    # 9.0f

    const v8, -0x435c28f6    # -0.02f

    const v9, 0x3f039581    # 0.514f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x1a

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x2724

    const-wide/16 v4, 0x2792

    const v6, -0x4053f7cf    # -1.344f

    const v7, -0x4053f7cf    # -1.344f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x1b

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x2724

    const-wide/16 v4, 0x2792

    const v6, 0x3dcccccd    # 0.1f

    const v7, 0x3dcccccd    # 0.1f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x1c

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x2792

    const-wide/16 v4, 0x27a6

    const/high16 v6, 0x3f000000    # 0.5f

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x1d

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x2792

    const-wide/16 v4, 0x27a6

    const/high16 v6, 0x41100000    # 9.0f

    const/high16 v7, 0x41100000    # 9.0f

    const v8, -0x435c28f6    # -0.02f

    const v9, 0x3f039581    # 0.514f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x1e

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x2792

    const-wide/16 v4, 0x27a6

    const v6, -0x4053f7cf    # -1.344f

    const v7, -0x4053f7cf    # -1.344f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x1f

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x2792

    const-wide/16 v4, 0x27a6

    const v6, 0x3dcccccd    # 0.1f

    const v7, 0x3dcccccd    # 0.1f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v0, 0x20

    new-instance v1, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x27a6

    const-wide/16 v4, 0x2b20

    const/high16 v6, 0x41100000    # 9.0f

    const/high16 v7, 0x41100000    # 9.0f

    const v8, -0x435c28f6    # -0.02f

    const v9, 0x3f039581    # 0.514f

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/videolib/b/x;-><init>(JJFFFF)V

    aput-object v1, v10, v0

    const/16 v8, 0x21

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x3

    const-wide/16 v2, 0x27a6

    const-wide/16 v4, 0x2b20

    const/high16 v6, 0x3f000000    # 0.5f

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x22

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x4

    const-wide/16 v2, 0x27a6

    const-wide/16 v4, 0x2b20

    const v6, -0x4053f7cf    # -1.344f

    const v7, -0x4012f1aa    # -1.852f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    const/16 v8, 0x23

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const/4 v1, 0x5

    const-wide/16 v2, 0x27a6

    const-wide/16 v4, 0x2b20

    const v6, 0x3dcccccd    # 0.1f

    const v7, 0x3dcccccd    # 0.1f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v10, v8

    iput-object v10, p0, Lcom/roidapp/videolib/b/f;->A:[Lcom/roidapp/videolib/b/x;

    .line 856
    return-void

    .line 25
    :array_0
    .array-data 8
        0x0
        0xc12
        0x182e
    .end array-data
.end method


# virtual methods
.method public final a(J)Ljp/co/cyberagent/android/a/h;
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x3

    const/4 v2, 0x1

    .line 1084
    const-wide/16 v0, 0xc8a

    cmp-long v0, p1, v0

    if-ltz v0, :cond_c

    .line 1086
    const-wide/16 v0, 0xe10

    cmp-long v0, p1, v0

    if-gez v0, :cond_4

    .line 1087
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->a:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/roidapp/videolib/b/f;->l:Ljava/util/List;

    .line 1107
    :goto_0
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1111
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->k:Ljp/co/cyberagent/android/a/k;

    iget-object v1, p0, Lcom/roidapp/videolib/b/f;->l:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/a/k;->a(Ljava/util/List;)V

    .line 1112
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->s:Lcom/roidapp/videolib/b/k;

    if-eqz v0, :cond_0

    .line 1113
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->s:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v0, p1, p2}, Lcom/roidapp/videolib/b/k;->a(J)V

    .line 1114
    :cond_0
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->C:Lcom/roidapp/videolib/b/k;

    if-eqz v0, :cond_1

    .line 1115
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->C:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v0, p1, p2}, Lcom/roidapp/videolib/b/k;->a(J)V

    .line 1116
    :cond_1
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->r:Lcom/roidapp/videolib/b/k;

    if-eqz v0, :cond_2

    .line 1117
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->r:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v0, p1, p2}, Lcom/roidapp/videolib/b/k;->a(J)V

    .line 1118
    :cond_2
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->t:Lcom/roidapp/videolib/b/k;

    if-eqz v0, :cond_3

    .line 1119
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->t:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v0, p1, p2}, Lcom/roidapp/videolib/b/k;->a(J)V

    .line 1120
    :cond_3
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->k:Ljp/co/cyberagent/android/a/k;

    return-object v0

    .line 1088
    :cond_4
    const-wide/16 v0, 0x1130

    cmp-long v0, p1, v0

    if-gez v0, :cond_5

    .line 1089
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->a:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/roidapp/videolib/b/f;->l:Ljava/util/List;

    goto :goto_0

    .line 1090
    :cond_5
    const-wide/16 v0, 0x18bd

    cmp-long v0, p1, v0

    if-gez v0, :cond_6

    .line 1091
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->a:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/roidapp/videolib/b/f;->l:Ljava/util/List;

    goto :goto_0

    .line 1092
    :cond_6
    const-wide/16 v0, 0x19c7

    cmp-long v0, p1, v0

    if-gez v0, :cond_7

    .line 1093
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->a:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/roidapp/videolib/b/f;->l:Ljava/util/List;

    goto :goto_0

    .line 1094
    :cond_7
    const-wide/16 v0, 0x1b57

    cmp-long v0, p1, v0

    if-gez v0, :cond_8

    .line 1095
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->a:Ljava/util/List;

    const/4 v1, 0x4

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/roidapp/videolib/b/f;->l:Ljava/util/List;

    goto :goto_0

    .line 1096
    :cond_8
    const-wide/16 v0, 0x1eba

    cmp-long v0, p1, v0

    if-gez v0, :cond_9

    .line 1097
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->a:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/roidapp/videolib/b/f;->l:Ljava/util/List;

    goto/16 :goto_0

    .line 1098
    :cond_9
    const-wide/16 v0, 0x268a

    cmp-long v0, p1, v0

    if-gez v0, :cond_a

    .line 1099
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->a:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/roidapp/videolib/b/f;->l:Ljava/util/List;

    goto/16 :goto_0

    .line 1100
    :cond_a
    const-wide/16 v0, 0x29aa

    cmp-long v0, p1, v0

    if-gez v0, :cond_b

    .line 1101
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->a:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/roidapp/videolib/b/f;->l:Ljava/util/List;

    goto/16 :goto_0

    .line 1102
    :cond_b
    const-wide/16 v0, 0x2d0d

    cmp-long v0, p1, v0

    if-gez v0, :cond_c

    .line 1103
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->a:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/roidapp/videolib/b/f;->l:Ljava/util/List;

    goto/16 :goto_0

    .line 1105
    :cond_c
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->a:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/roidapp/videolib/b/f;->l:Ljava/util/List;

    goto/16 :goto_0
.end method

.method protected final a()V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 910
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 911
    iget-object v1, p0, Lcom/roidapp/videolib/b/f;->h:Ljp/co/cyberagent/android/a/h;

    if-eqz v1, :cond_0

    .line 912
    iget-object v1, p0, Lcom/roidapp/videolib/b/f;->h:Ljp/co/cyberagent/android/a/h;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 913
    :cond_0
    iget-object v1, p0, Lcom/roidapp/videolib/b/f;->B:Ljp/co/cyberagent/android/a/s;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 915
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 916
    iget-object v2, p0, Lcom/roidapp/videolib/b/f;->e:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_1

    .line 917
    iget-object v2, p0, Lcom/roidapp/videolib/b/f;->e:Ljava/util/List;

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 918
    :cond_1
    iget-object v2, p0, Lcom/roidapp/videolib/b/f;->h:Ljp/co/cyberagent/android/a/h;

    if-eqz v2, :cond_2

    .line 919
    iget-object v2, p0, Lcom/roidapp/videolib/b/f;->h:Ljp/co/cyberagent/android/a/h;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 920
    :cond_2
    iget-object v2, p0, Lcom/roidapp/videolib/b/f;->B:Ljp/co/cyberagent/android/a/s;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 922
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 923
    iget-object v3, p0, Lcom/roidapp/videolib/b/f;->e:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_3

    .line 924
    iget-object v3, p0, Lcom/roidapp/videolib/b/f;->e:Ljava/util/List;

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 925
    :cond_3
    iget-object v3, p0, Lcom/roidapp/videolib/b/f;->e:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-le v3, v7, :cond_4

    .line 926
    iget-object v3, p0, Lcom/roidapp/videolib/b/f;->e:Ljava/util/List;

    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 927
    :cond_4
    iget-object v3, p0, Lcom/roidapp/videolib/b/f;->h:Ljp/co/cyberagent/android/a/h;

    if-eqz v3, :cond_5

    .line 928
    iget-object v3, p0, Lcom/roidapp/videolib/b/f;->h:Ljp/co/cyberagent/android/a/h;

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 929
    :cond_5
    iget-object v3, p0, Lcom/roidapp/videolib/b/f;->B:Ljp/co/cyberagent/android/a/s;

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 931
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 932
    iget-object v4, p0, Lcom/roidapp/videolib/b/f;->e:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-lez v4, :cond_6

    .line 933
    iget-object v4, p0, Lcom/roidapp/videolib/b/f;->e:Ljava/util/List;

    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 934
    :cond_6
    iget-object v4, p0, Lcom/roidapp/videolib/b/f;->B:Ljp/co/cyberagent/android/a/s;

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 936
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 937
    iget-object v5, p0, Lcom/roidapp/videolib/b/f;->e:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-lez v5, :cond_7

    .line 938
    iget-object v5, p0, Lcom/roidapp/videolib/b/f;->e:Ljava/util/List;

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 939
    :cond_7
    iget-object v5, p0, Lcom/roidapp/videolib/b/f;->e:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-le v5, v7, :cond_8

    .line 940
    iget-object v5, p0, Lcom/roidapp/videolib/b/f;->e:Ljava/util/List;

    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 941
    :cond_8
    iget-object v5, p0, Lcom/roidapp/videolib/b/f;->B:Ljp/co/cyberagent/android/a/s;

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 943
    iget-object v5, p0, Lcom/roidapp/videolib/b/f;->a:Ljava/util/List;

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 944
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 945
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->a:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 946
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->a:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 947
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->a:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 948
    return-void
.end method

.method public final a(Lcom/roidapp/videolib/gl/e;)V
    .locals 2

    .prologue
    .line 859
    invoke-super {p0, p1}, Lcom/roidapp/videolib/b/c;->a(Lcom/roidapp/videolib/gl/e;)V

    .line 860
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->B:Ljp/co/cyberagent/android/a/s;

    if-eqz v0, :cond_0

    .line 861
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->B:Ljp/co/cyberagent/android/a/s;

    iget-object v1, p0, Lcom/roidapp/videolib/b/f;->o:Lcom/roidapp/videolib/gl/e;

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/a/s;->a(Lcom/roidapp/videolib/gl/e;)V

    .line 867
    :cond_0
    return-void
.end method

.method protected final b()V
    .locals 2

    .prologue
    .line 951
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 952
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->c:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/videolib/b/f;->B:Ljp/co/cyberagent/android/a/s;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 953
    return-void
.end method

.method protected final c()V
    .locals 2

    .prologue
    .line 956
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 957
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 958
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->b:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/videolib/b/f;->e:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 960
    :cond_0
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->h:Ljp/co/cyberagent/android/a/h;

    if-eqz v0, :cond_1

    .line 961
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->b:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/videolib/b/f;->h:Ljp/co/cyberagent/android/a/h;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 963
    :cond_1
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->b:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/videolib/b/f;->B:Ljp/co/cyberagent/android/a/s;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 965
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->j:Ljp/co/cyberagent/android/a/h;

    if-eqz v0, :cond_2

    .line 966
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->b:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/videolib/b/f;->j:Ljp/co/cyberagent/android/a/h;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 967
    :cond_2
    return-void
.end method

.method protected final d()V
    .locals 5

    .prologue
    .line 970
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 971
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->c:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/videolib/b/f;->f:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 972
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->c:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/videolib/b/f;->f:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 974
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->b:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/videolib/b/f;->f:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 975
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->b:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/videolib/b/f;->f:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 977
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 978
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v2, p0, Lcom/roidapp/videolib/b/f;->j:Ljp/co/cyberagent/android/a/h;

    invoke-interface {v0, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-result v2

    .line 979
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v3, p0, Lcom/roidapp/videolib/b/f;->B:Ljp/co/cyberagent/android/a/s;

    invoke-interface {v0, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-result v3

    .line 980
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v4, p0, Lcom/roidapp/videolib/b/f;->f:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 981
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v4, p0, Lcom/roidapp/videolib/b/f;->f:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 982
    if-eqz v3, :cond_0

    .line 983
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v3, p0, Lcom/roidapp/videolib/b/f;->B:Ljp/co/cyberagent/android/a/s;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 984
    :cond_0
    if-eqz v2, :cond_1

    .line 985
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v2, p0, Lcom/roidapp/videolib/b/f;->j:Ljp/co/cyberagent/android/a/h;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 977
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 989
    :cond_2
    return-void
.end method

.method public final e()V
    .locals 0

    .prologue
    .line 991
    invoke-super {p0}, Lcom/roidapp/videolib/b/c;->e()V

    .line 992
    invoke-virtual {p0}, Lcom/roidapp/videolib/b/f;->f()V

    .line 993
    return-void
.end method

.method protected final f()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v1, 0x0

    .line 870
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->r:Lcom/roidapp/videolib/b/k;

    if-eqz v0, :cond_1

    .line 907
    :cond_0
    :goto_0
    return-void

    .line 873
    :cond_1
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->r:Lcom/roidapp/videolib/b/k;

    if-nez v0, :cond_2

    .line 874
    new-instance v0, Lcom/roidapp/videolib/b/k;

    invoke-direct {v0}, Lcom/roidapp/videolib/b/k;-><init>()V

    iput-object v0, p0, Lcom/roidapp/videolib/b/f;->r:Lcom/roidapp/videolib/b/k;

    .line 876
    :cond_2
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->s:Lcom/roidapp/videolib/b/k;

    if-nez v0, :cond_3

    .line 877
    new-instance v0, Lcom/roidapp/videolib/b/k;

    invoke-direct {v0}, Lcom/roidapp/videolib/b/k;-><init>()V

    iput-object v0, p0, Lcom/roidapp/videolib/b/f;->s:Lcom/roidapp/videolib/b/k;

    .line 879
    :cond_3
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->C:Lcom/roidapp/videolib/b/k;

    if-nez v0, :cond_4

    .line 880
    new-instance v0, Lcom/roidapp/videolib/b/k;

    invoke-direct {v0}, Lcom/roidapp/videolib/b/k;-><init>()V

    iput-object v0, p0, Lcom/roidapp/videolib/b/f;->C:Lcom/roidapp/videolib/b/k;

    .line 882
    :cond_4
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->r:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/k;->a()V

    .line 883
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->C:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/k;->a()V

    .line 884
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->s:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/k;->a()V

    move v0, v1

    .line 886
    :goto_1
    iget-object v2, p0, Lcom/roidapp/videolib/b/f;->p:[Lcom/roidapp/videolib/b/x;

    array-length v2, v2

    if-ge v0, v2, :cond_5

    .line 887
    iget-object v2, p0, Lcom/roidapp/videolib/b/f;->r:Lcom/roidapp/videolib/b/k;

    iget-object v3, p0, Lcom/roidapp/videolib/b/f;->p:[Lcom/roidapp/videolib/b/x;

    aget-object v3, v3, v0

    invoke-virtual {v2, v3}, Lcom/roidapp/videolib/b/k;->a(Lcom/roidapp/videolib/b/x;)V

    .line 886
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    move v0, v1

    .line 889
    :goto_2
    iget-object v2, p0, Lcom/roidapp/videolib/b/f;->z:[Lcom/roidapp/videolib/b/x;

    array-length v2, v2

    if-ge v0, v2, :cond_6

    .line 890
    iget-object v2, p0, Lcom/roidapp/videolib/b/f;->s:Lcom/roidapp/videolib/b/k;

    iget-object v3, p0, Lcom/roidapp/videolib/b/f;->z:[Lcom/roidapp/videolib/b/x;

    aget-object v3, v3, v0

    invoke-virtual {v2, v3}, Lcom/roidapp/videolib/b/k;->a(Lcom/roidapp/videolib/b/x;)V

    .line 889
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_6
    move v0, v1

    .line 893
    :goto_3
    iget-object v2, p0, Lcom/roidapp/videolib/b/f;->A:[Lcom/roidapp/videolib/b/x;

    array-length v2, v2

    if-ge v0, v2, :cond_7

    .line 894
    iget-object v2, p0, Lcom/roidapp/videolib/b/f;->C:Lcom/roidapp/videolib/b/k;

    iget-object v3, p0, Lcom/roidapp/videolib/b/f;->A:[Lcom/roidapp/videolib/b/x;

    aget-object v3, v3, v0

    invoke-virtual {v2, v3}, Lcom/roidapp/videolib/b/k;->a(Lcom/roidapp/videolib/b/x;)V

    .line 893
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 897
    :cond_7
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->h:Ljp/co/cyberagent/android/a/h;

    if-eqz v0, :cond_8

    .line 898
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->r:Lcom/roidapp/videolib/b/k;

    iget-object v2, p0, Lcom/roidapp/videolib/b/f;->h:Ljp/co/cyberagent/android/a/h;

    invoke-virtual {v0, v2}, Lcom/roidapp/videolib/b/k;->a(Ljp/co/cyberagent/android/a/h;)V

    .line 900
    :cond_8
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_9

    .line 901
    iget-object v2, p0, Lcom/roidapp/videolib/b/f;->s:Lcom/roidapp/videolib/b/k;

    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->e:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/a/h;

    invoke-virtual {v2, v0}, Lcom/roidapp/videolib/b/k;->a(Ljp/co/cyberagent/android/a/h;)V

    .line 903
    :cond_9
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v4, :cond_0

    .line 904
    iget-object v1, p0, Lcom/roidapp/videolib/b/f;->C:Lcom/roidapp/videolib/b/k;

    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->e:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/a/h;

    invoke-virtual {v1, v0}, Lcom/roidapp/videolib/b/k;->a(Ljp/co/cyberagent/android/a/h;)V

    goto/16 :goto_0
.end method

.method public final g()I
    .locals 1

    .prologue
    .line 1124
    const/4 v0, 0x2

    return v0
.end method

.method public final h()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 1024
    .line 1996
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1997
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1998
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->k:Ljp/co/cyberagent/android/a/k;

    if-eqz v0, :cond_0

    .line 1999
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->k:Ljp/co/cyberagent/android/a/k;

    iget-object v1, p0, Lcom/roidapp/videolib/b/f;->c:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/a/k;->a(Ljava/util/List;)V

    .line 2000
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->k:Ljp/co/cyberagent/android/a/k;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/a/k;->i()V

    .line 2002
    :cond_0
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2003
    iput-object v2, p0, Lcom/roidapp/videolib/b/f;->k:Ljp/co/cyberagent/android/a/k;

    .line 2005
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->C:Lcom/roidapp/videolib/b/k;

    if-eqz v0, :cond_1

    .line 2006
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->C:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/k;->a()V

    .line 2007
    :cond_1
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->s:Lcom/roidapp/videolib/b/k;

    if-eqz v0, :cond_2

    .line 2008
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->s:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/k;->a()V

    .line 2009
    :cond_2
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->r:Lcom/roidapp/videolib/b/k;

    if-eqz v0, :cond_3

    .line 2010
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->r:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/k;->a()V

    .line 2011
    :cond_3
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->t:Lcom/roidapp/videolib/b/k;

    if-eqz v0, :cond_4

    .line 2012
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->t:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/k;->a()V

    .line 2013
    :cond_4
    iput-object v2, p0, Lcom/roidapp/videolib/b/f;->s:Lcom/roidapp/videolib/b/k;

    .line 2014
    iput-object v2, p0, Lcom/roidapp/videolib/b/f;->t:Lcom/roidapp/videolib/b/k;

    .line 2015
    iput-object v2, p0, Lcom/roidapp/videolib/b/f;->r:Lcom/roidapp/videolib/b/k;

    .line 2017
    iput-object v2, p0, Lcom/roidapp/videolib/b/f;->h:Ljp/co/cyberagent/android/a/h;

    .line 2018
    iget-object v0, p0, Lcom/roidapp/videolib/b/f;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2019
    iput-object v2, p0, Lcom/roidapp/videolib/b/f;->j:Ljp/co/cyberagent/android/a/h;

    .line 2020
    iput-object v2, p0, Lcom/roidapp/videolib/b/f;->i:Ljp/co/cyberagent/android/a/h;

    .line 1025
    iput-object v2, p0, Lcom/roidapp/videolib/b/f;->B:Ljp/co/cyberagent/android/a/s;

    .line 1026
    iput-object v2, p0, Lcom/roidapp/videolib/b/f;->o:Lcom/roidapp/videolib/gl/e;

    .line 1027
    invoke-super {p0}, Lcom/roidapp/videolib/b/c;->h()V

    .line 1029
    return-void
.end method
