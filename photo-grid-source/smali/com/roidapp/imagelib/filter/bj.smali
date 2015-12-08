.class public final Lcom/roidapp/imagelib/filter/bj;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:[[Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

.field public final b:[Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;


# direct methods
.method public constructor <init>()V
    .locals 15

    .prologue
    const/4 v14, 0x4

    const/4 v13, 0x3

    const/4 v11, 0x2

    const/4 v5, 0x1

    const/4 v9, 0x0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const/4 v0, 0x5

    new-array v0, v0, [[Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    const/16 v1, 0x9

    new-array v1, v1, [Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    new-instance v2, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    sget v3, Lcom/roidapp/imagelib/f;->aH:I

    const-string v4, "Original"

    invoke-direct {v2, v9, v3, v4, v5}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v2, v1, v9

    new-instance v2, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    const/16 v3, 0x25

    sget v4, Lcom/roidapp/imagelib/f;->aL:I

    const-string v6, "S1"

    invoke-direct {v2, v3, v4, v6, v11}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v2, v1, v5

    new-instance v2, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    const/16 v3, 0x1d

    sget v4, Lcom/roidapp/imagelib/f;->aK:I

    const-string v6, "S2"

    invoke-direct {v2, v3, v4, v6, v13}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v2, v1, v11

    new-instance v2, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    const/16 v3, 0x26

    sget v4, Lcom/roidapp/imagelib/f;->am:I

    const-string v6, "S3"

    invoke-direct {v2, v3, v4, v6, v14}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v2, v1, v13

    new-instance v2, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    const/16 v3, 0x1e

    sget v4, Lcom/roidapp/imagelib/f;->aU:I

    const-string v6, "S4"

    const/4 v7, 0x5

    invoke-direct {v2, v3, v4, v6, v7}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v2, v1, v14

    const/4 v2, 0x5

    new-instance v3, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    const/16 v4, 0x27

    sget v6, Lcom/roidapp/imagelib/f;->bo:I

    const-string v7, "S5"

    const/4 v8, 0x6

    invoke-direct {v3, v4, v6, v7, v8}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v3, v1, v2

    const/4 v2, 0x6

    new-instance v3, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    const/16 v4, 0x28

    sget v6, Lcom/roidapp/imagelib/f;->ac:I

    const-string v7, "S6"

    const/4 v8, 0x7

    invoke-direct {v3, v4, v6, v7, v8}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v3, v1, v2

    const/4 v2, 0x7

    new-instance v3, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    sget v4, Lcom/roidapp/imagelib/f;->ah:I

    const-string v6, "S7"

    const/16 v7, 0x8

    invoke-direct {v3, v5, v4, v6, v7}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v3, v1, v2

    const/16 v2, 0x8

    new-instance v3, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    const/16 v4, 0xe

    sget v6, Lcom/roidapp/imagelib/f;->aD:I

    const-string v7, "S8"

    const/16 v8, 0x9

    invoke-direct {v3, v4, v6, v7, v8}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v3, v1, v2

    aput-object v1, v0, v9

    const/16 v1, 0x9

    new-array v1, v1, [Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    new-instance v2, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    sget v3, Lcom/roidapp/imagelib/f;->aH:I

    const-string v4, "Original"

    const/16 v6, 0xa

    invoke-direct {v2, v9, v3, v4, v6}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v2, v1, v9

    new-instance v2, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    const/16 v3, 0x2e

    sget v4, Lcom/roidapp/imagelib/f;->ba:I

    const-string v6, "V1"

    const/16 v7, 0xb

    invoke-direct {v2, v3, v4, v6, v7}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v2, v1, v5

    new-instance v2, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    sget v3, Lcom/roidapp/imagelib/f;->bl:I

    const-string v4, "V2"

    const/16 v6, 0xc

    invoke-direct {v2, v11, v3, v4, v6}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v2, v1, v11

    new-instance v2, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    sget v3, Lcom/roidapp/imagelib/f;->bk:I

    const-string v4, "V3"

    const/16 v6, 0xd

    invoke-direct {v2, v14, v3, v4, v6}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v2, v1, v13

    new-instance v2, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    const/16 v3, 0xb

    sget v4, Lcom/roidapp/imagelib/f;->aV:I

    const-string v6, "V4"

    const/16 v7, 0xe

    invoke-direct {v2, v3, v4, v6, v7}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v2, v1, v14

    const/4 v2, 0x5

    new-instance v3, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    const/16 v4, 0xc

    sget v6, Lcom/roidapp/imagelib/f;->aG:I

    const-string v7, "V5"

    const/16 v8, 0xf

    invoke-direct {v3, v4, v6, v7, v8}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v3, v1, v2

    const/4 v2, 0x6

    new-instance v3, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    const/16 v4, 0xd

    sget v6, Lcom/roidapp/imagelib/f;->az:I

    const-string v7, "V6"

    const/16 v8, 0x10

    invoke-direct {v3, v4, v6, v7, v8}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v3, v1, v2

    const/4 v2, 0x7

    new-instance v3, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    const/16 v4, 0x11

    sget v6, Lcom/roidapp/imagelib/f;->ad:I

    const-string v7, "V7"

    const/16 v8, 0x11

    invoke-direct {v3, v4, v6, v7, v8}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v3, v1, v2

    const/16 v2, 0x8

    new-instance v3, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    const/16 v4, 0x12

    sget v6, Lcom/roidapp/imagelib/f;->aE:I

    const-string v7, "V8"

    const/16 v8, 0x12

    invoke-direct {v3, v4, v6, v7, v8}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v3, v1, v2

    aput-object v1, v0, v5

    const/16 v1, 0x9

    new-array v1, v1, [Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    new-instance v2, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    sget v3, Lcom/roidapp/imagelib/f;->aH:I

    const-string v4, "Original"

    const/16 v6, 0x13

    invoke-direct {v2, v9, v3, v4, v6}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v2, v1, v9

    new-instance v2, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    const/16 v3, 0x29

    sget v4, Lcom/roidapp/imagelib/f;->aR:I

    const-string v6, "SC1"

    const/16 v7, 0x14

    invoke-direct {v2, v3, v4, v6, v7}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v2, v1, v5

    new-instance v2, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    sget v3, Lcom/roidapp/imagelib/f;->be:I

    const-string v4, "SC2"

    const/16 v6, 0x15

    invoke-direct {v2, v13, v3, v4, v6}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v2, v1, v11

    new-instance v2, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    const/4 v3, 0x5

    sget v4, Lcom/roidapp/imagelib/f;->aC:I

    const-string v6, "SC3"

    const/16 v7, 0x16

    invoke-direct {v2, v3, v4, v6, v7}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v2, v1, v13

    new-instance v2, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    const/4 v3, 0x6

    sget v4, Lcom/roidapp/imagelib/f;->af:I

    const-string v6, "SC4"

    const/16 v7, 0x17

    invoke-direct {v2, v3, v4, v6, v7}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v2, v1, v14

    const/4 v2, 0x5

    new-instance v3, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    const/4 v4, 0x7

    sget v6, Lcom/roidapp/imagelib/f;->aA:I

    const-string v7, "SC5"

    const/16 v8, 0x18

    invoke-direct {v3, v4, v6, v7, v8}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v3, v1, v2

    const/4 v2, 0x6

    new-instance v3, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    const/16 v4, 0x8

    sget v6, Lcom/roidapp/imagelib/f;->ai:I

    const-string v7, "SC6"

    const/16 v8, 0x19

    invoke-direct {v3, v4, v6, v7, v8}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v3, v1, v2

    const/4 v2, 0x7

    new-instance v3, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    const/16 v4, 0xf

    sget v6, Lcom/roidapp/imagelib/f;->ag:I

    const-string v7, "SC7"

    const/16 v8, 0x1a

    invoke-direct {v3, v4, v6, v7, v8}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v3, v1, v2

    const/16 v2, 0x8

    new-instance v3, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    const/16 v4, 0x10

    sget v6, Lcom/roidapp/imagelib/f;->bc:I

    const-string v7, "SC8"

    const/16 v8, 0x1b

    invoke-direct {v3, v4, v6, v7, v8}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v3, v1, v2

    aput-object v1, v0, v11

    const/16 v1, 0x9

    new-array v1, v1, [Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    new-instance v2, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    sget v3, Lcom/roidapp/imagelib/f;->aH:I

    const-string v4, "Original"

    const/16 v6, 0x1c

    invoke-direct {v2, v9, v3, v4, v6}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v2, v1, v9

    new-instance v2, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    const/16 v3, 0x16

    sget v4, Lcom/roidapp/imagelib/f;->aJ:I

    const-string v6, "H1"

    const/16 v7, 0x1d

    invoke-direct {v2, v3, v4, v6, v7}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v2, v1, v5

    new-instance v2, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    const/16 v3, 0x1a

    sget v4, Lcom/roidapp/imagelib/f;->ak:I

    const-string v6, "H2"

    const/16 v7, 0x1e

    invoke-direct {v2, v3, v4, v6, v7}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v2, v1, v11

    new-instance v2, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    const/16 v3, 0x17

    sget v4, Lcom/roidapp/imagelib/f;->aT:I

    const-string v6, "H3"

    const/16 v7, 0x1f

    invoke-direct {v2, v3, v4, v6, v7}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v2, v1, v13

    new-instance v2, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    const/16 v3, 0x2a

    sget v4, Lcom/roidapp/imagelib/f;->k:I

    const-string v6, "H4"

    const/16 v7, 0x20

    invoke-direct {v2, v3, v4, v6, v7}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v2, v1, v14

    const/4 v2, 0x5

    new-instance v3, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    const/16 v4, 0x19

    sget v6, Lcom/roidapp/imagelib/f;->j:I

    const-string v7, "H5"

    const/16 v8, 0x21

    invoke-direct {v3, v4, v6, v7, v8}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v3, v1, v2

    const/4 v2, 0x6

    new-instance v3, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    const/16 v4, 0x1b

    sget v6, Lcom/roidapp/imagelib/f;->aO:I

    const-string v7, "H6"

    const/16 v8, 0x22

    invoke-direct {v3, v4, v6, v7, v8}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v3, v1, v2

    const/4 v2, 0x7

    new-instance v3, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    const/16 v4, 0x23

    sget v6, Lcom/roidapp/imagelib/f;->aQ:I

    const-string v7, "H7"

    const/16 v8, 0x23

    invoke-direct {v3, v4, v6, v7, v8}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v3, v1, v2

    const/16 v2, 0x8

    new-instance v3, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    const/16 v4, 0x18

    sget v6, Lcom/roidapp/imagelib/f;->bn:I

    const-string v7, "H8"

    const/16 v8, 0x24

    invoke-direct {v3, v4, v6, v7, v8}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v3, v1, v2

    aput-object v1, v0, v13

    const/16 v1, 0x9

    new-array v1, v1, [Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    new-instance v2, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    sget v3, Lcom/roidapp/imagelib/f;->aH:I

    const-string v4, "Original"

    const/16 v6, 0x25

    invoke-direct {v2, v9, v3, v4, v6}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v2, v1, v9

    new-instance v2, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    const/16 v3, 0xa

    sget v4, Lcom/roidapp/imagelib/f;->s:I

    const-string v6, "BW1"

    const/16 v7, 0x26

    invoke-direct {v2, v3, v4, v6, v7}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v2, v1, v5

    new-instance v2, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    const/16 v3, 0x9

    sget v4, Lcom/roidapp/imagelib/f;->aZ:I

    const-string v6, "BW2"

    const/16 v7, 0x27

    invoke-direct {v2, v3, v4, v6, v7}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v2, v1, v11

    new-instance v2, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    const/16 v3, 0x1c

    sget v4, Lcom/roidapp/imagelib/f;->g:I

    const-string v6, "BW3"

    const/16 v7, 0x28

    invoke-direct {v2, v3, v4, v6, v7}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v2, v1, v13

    new-instance v2, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    const/16 v3, 0x24

    sget v4, Lcom/roidapp/imagelib/f;->h:I

    const-string v6, "BW4"

    const/16 v7, 0x29

    invoke-direct {v2, v3, v4, v6, v7}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v2, v1, v14

    const/4 v2, 0x5

    new-instance v3, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    const/16 v4, 0x2c

    sget v6, Lcom/roidapp/imagelib/f;->bi:I

    const-string v7, "BW5"

    const/16 v8, 0x2a

    invoke-direct {v3, v4, v6, v7, v8}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v3, v1, v2

    const/4 v2, 0x6

    new-instance v3, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    const/16 v4, 0x2b

    sget v6, Lcom/roidapp/imagelib/f;->h:I

    const-string v7, "BW6"

    const/16 v8, 0x2b

    invoke-direct {v3, v4, v6, v7, v8}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v3, v1, v2

    const/4 v2, 0x7

    new-instance v3, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    const/16 v4, 0x13

    sget v6, Lcom/roidapp/imagelib/f;->bb:I

    const-string v7, "BW7"

    const/16 v8, 0x2c

    invoke-direct {v3, v4, v6, v7, v8}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v3, v1, v2

    const/16 v2, 0x8

    new-instance v3, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    const/16 v4, 0x2d

    sget v6, Lcom/roidapp/imagelib/f;->aF:I

    const-string v7, "BW8"

    const/16 v8, 0x2d

    invoke-direct {v3, v4, v6, v7, v8}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v3, v1, v2

    aput-object v1, v0, v14

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/bj;->a:[[Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    .line 110
    const/4 v0, 0x5

    new-array v12, v0, [Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;

    new-instance v0, Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;

    sget v1, Lcom/roidapp/imagelib/j;->l:I

    sget v2, Lcom/roidapp/imagelib/f;->aW:I

    sget v3, Lcom/roidapp/imagelib/d;->e:I

    iget-object v4, p0, Lcom/roidapp/imagelib/filter/bj;->a:[[Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    aget-object v4, v4, v9

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;-><init>(III[Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;I)V

    aput-object v0, v12, v9

    new-instance v6, Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;

    sget v7, Lcom/roidapp/imagelib/j;->n:I

    sget v8, Lcom/roidapp/imagelib/f;->bj:I

    sget v9, Lcom/roidapp/imagelib/d;->h:I

    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bj;->a:[[Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    aget-object v10, v0, v5

    invoke-direct/range {v6 .. v11}, Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;-><init>(III[Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;I)V

    aput-object v6, v12, v5

    new-instance v0, Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;

    sget v1, Lcom/roidapp/imagelib/j;->g:I

    sget v2, Lcom/roidapp/imagelib/f;->aB:I

    sget v3, Lcom/roidapp/imagelib/d;->g:I

    iget-object v4, p0, Lcom/roidapp/imagelib/filter/bj;->a:[[Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    aget-object v4, v4, v11

    move v5, v13

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;-><init>(III[Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;I)V

    aput-object v0, v12, v11

    new-instance v0, Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;

    sget v1, Lcom/roidapp/imagelib/j;->e:I

    sget v2, Lcom/roidapp/imagelib/f;->an:I

    sget v3, Lcom/roidapp/imagelib/d;->i:I

    iget-object v4, p0, Lcom/roidapp/imagelib/filter/bj;->a:[[Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    aget-object v4, v4, v13

    move v5, v14

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;-><init>(III[Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;I)V

    aput-object v0, v12, v13

    new-instance v0, Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;

    sget v1, Lcom/roidapp/imagelib/j;->b:I

    sget v2, Lcom/roidapp/imagelib/f;->r:I

    sget v3, Lcom/roidapp/imagelib/d;->f:I

    iget-object v4, p0, Lcom/roidapp/imagelib/filter/bj;->a:[[Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    aget-object v4, v4, v14

    const/4 v5, 0x5

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;-><init>(III[Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;I)V

    aput-object v0, v12, v14

    iput-object v12, p0, Lcom/roidapp/imagelib/filter/bj;->b:[Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;

    return-void
.end method
