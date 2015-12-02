.class public Landroid_src/mms/e/k;
.super Ljava/lang/Object;
.source "PduComposer.java"


# static fields
.field static final synthetic c:Z

.field private static h:Ljava/util/HashMap;
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
.field protected a:Ljava/io/ByteArrayOutputStream;

.field protected b:I

.field private d:Landroid_src/mms/e/f;

.field private e:Landroid_src/mms/e/m;

.field private final f:Landroid/content/ContentResolver;

.field private g:Landroid_src/mms/e/q;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 32
    const-class v0, Landroid_src/mms/e/k;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Landroid_src/mms/e/k;->c:Z

    .line 118
    const/4 v0, 0x0

    sput-object v0, Landroid_src/mms/e/k;->h:Ljava/util/HashMap;

    .line 121
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Landroid_src/mms/e/k;->h:Ljava/util/HashMap;

    .line 124
    :goto_1
    sget-object v0, Landroid_src/mms/e/p;->a:[Ljava/lang/String;

    array-length v0, v0

    if-ge v1, v0, :cond_1

    .line 125
    sget-object v0, Landroid_src/mms/e/k;->h:Ljava/util/HashMap;

    sget-object v2, Landroid_src/mms/e/p;->a:[Ljava/lang/String;

    aget-object v2, v2, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_0
    move v0, v1

    .line 32
    goto :goto_0

    .line 127
    :cond_1
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid_src/mms/e/f;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    iput-object v1, p0, Landroid_src/mms/e/k;->a:Ljava/io/ByteArrayOutputStream;

    .line 93
    iput-object v1, p0, Landroid_src/mms/e/k;->d:Landroid_src/mms/e/f;

    .line 98
    iput v2, p0, Landroid_src/mms/e/k;->b:I

    .line 103
    iput-object v1, p0, Landroid_src/mms/e/k;->e:Landroid_src/mms/e/m;

    .line 113
    iput-object v1, p0, Landroid_src/mms/e/k;->g:Landroid_src/mms/e/q;

    .line 136
    iput-object p2, p0, Landroid_src/mms/e/k;->d:Landroid_src/mms/e/f;

    .line 137
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iput-object v0, p0, Landroid_src/mms/e/k;->f:Landroid/content/ContentResolver;

    .line 138
    invoke-virtual {p2}, Landroid_src/mms/e/f;->e()Landroid_src/mms/e/q;

    move-result-object v0

    iput-object v0, p0, Landroid_src/mms/e/k;->g:Landroid_src/mms/e/q;

    .line 139
    new-instance v0, Landroid_src/mms/e/m;

    invoke-direct {v0, p0, v1}, Landroid_src/mms/e/m;-><init>(Landroid_src/mms/e/k;Landroid_src/mms/e/l;)V

    iput-object v0, p0, Landroid_src/mms/e/k;->e:Landroid_src/mms/e/m;

    .line 140
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object v0, p0, Landroid_src/mms/e/k;->a:Ljava/io/ByteArrayOutputStream;

    .line 141
    iput v2, p0, Landroid_src/mms/e/k;->b:I

    .line 142
    return-void
.end method

.method static synthetic a(Landroid_src/mms/e/k;)Landroid_src/mms/e/m;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Landroid_src/mms/e/k;->e:Landroid_src/mms/e/m;

    return-object v0
.end method

.method private b()I
    .locals 3

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 652
    iget-object v2, p0, Landroid_src/mms/e/k;->a:Ljava/io/ByteArrayOutputStream;

    if-nez v2, :cond_0

    .line 653
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object v2, p0, Landroid_src/mms/e/k;->a:Ljava/io/ByteArrayOutputStream;

    .line 654
    iput v1, p0, Landroid_src/mms/e/k;->b:I

    .line 658
    :cond_0
    const/16 v2, 0x8c

    invoke-virtual {p0, v2}, Landroid_src/mms/e/k;->c(I)V

    .line 659
    const/16 v2, 0x87

    invoke-virtual {p0, v2}, Landroid_src/mms/e/k;->c(I)V

    .line 662
    const/16 v2, 0x8d

    invoke-direct {p0, v2}, Landroid_src/mms/e/k;->e(I)I

    move-result v2

    if-eqz v2, :cond_2

    .line 693
    :cond_1
    :goto_0
    return v0

    .line 667
    :cond_2
    const/16 v2, 0x8b

    invoke-direct {p0, v2}, Landroid_src/mms/e/k;->e(I)I

    move-result v2

    if-nez v2, :cond_1

    .line 672
    const/16 v2, 0x97

    invoke-direct {p0, v2}, Landroid_src/mms/e/k;->e(I)I

    move-result v2

    if-nez v2, :cond_1

    .line 677
    const/16 v2, 0x89

    invoke-direct {p0, v2}, Landroid_src/mms/e/k;->e(I)I

    move-result v2

    if-nez v2, :cond_1

    .line 682
    const/16 v2, 0x85

    invoke-direct {p0, v2}, Landroid_src/mms/e/k;->e(I)I

    .line 685
    const/16 v2, 0x9b

    invoke-direct {p0, v2}, Landroid_src/mms/e/k;->e(I)I

    move-result v2

    if-nez v2, :cond_1

    move v0, v1

    .line 693
    goto :goto_0
.end method

.method private b(Landroid_src/mms/e/e;)Landroid_src/mms/e/e;
    .locals 3

    .prologue
    .line 456
    .line 459
    :try_start_0
    invoke-virtual {p1}, Landroid_src/mms/e/e;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid_src/mms/e/k;->c(Ljava/lang/String;)I

    move-result v1

    .line 460
    invoke-static {p1}, Landroid_src/mms/e/e;->a(Landroid_src/mms/e/e;)Landroid_src/mms/e/e;

    move-result-object v0

    .line 461
    const/4 v2, 0x1

    if-ne v2, v1, :cond_1

    .line 463
    const-string v1, "/TYPE=PLMN"

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid_src/mms/e/e;->b([B)V

    .line 475
    :cond_0
    :goto_0
    return-object v0

    .line 464
    :cond_1
    const/4 v2, 0x3

    if-ne v2, v1, :cond_2

    .line 466
    const-string v1, "/TYPE=IPV4"

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid_src/mms/e/e;->b([B)V

    goto :goto_0

    .line 471
    :catch_0
    move-exception v0

    .line 472
    const/4 v0, 0x0

    goto :goto_0

    .line 467
    :cond_2
    const/4 v2, 0x4

    if-ne v2, v1, :cond_0

    .line 469
    const-string v1, "/TYPE=IPV6"

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid_src/mms/e/e;->b([B)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0
.end method

.method private c()I
    .locals 3

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 700
    iget-object v2, p0, Landroid_src/mms/e/k;->a:Ljava/io/ByteArrayOutputStream;

    if-nez v2, :cond_0

    .line 701
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object v2, p0, Landroid_src/mms/e/k;->a:Ljava/io/ByteArrayOutputStream;

    .line 702
    iput v1, p0, Landroid_src/mms/e/k;->b:I

    .line 706
    :cond_0
    const/16 v2, 0x8c

    invoke-virtual {p0, v2}, Landroid_src/mms/e/k;->c(I)V

    .line 707
    const/16 v2, 0x83

    invoke-virtual {p0, v2}, Landroid_src/mms/e/k;->c(I)V

    .line 710
    const/16 v2, 0x98

    invoke-direct {p0, v2}, Landroid_src/mms/e/k;->e(I)I

    move-result v2

    if-eqz v2, :cond_2

    .line 725
    :cond_1
    :goto_0
    return v0

    .line 715
    :cond_2
    const/16 v2, 0x8d

    invoke-direct {p0, v2}, Landroid_src/mms/e/k;->e(I)I

    move-result v2

    if-nez v2, :cond_1

    .line 720
    const/16 v2, 0x95

    invoke-direct {p0, v2}, Landroid_src/mms/e/k;->e(I)I

    move-result v2

    if-nez v2, :cond_1

    move v0, v1

    .line 725
    goto :goto_0
.end method

.method protected static c(Ljava/lang/String;)I
    .locals 2

    .prologue
    const/4 v0, 0x5

    .line 1160
    if-nez p0, :cond_1

    .line 1178
    :cond_0
    :goto_0
    return v0

    .line 1164
    :cond_1
    const-string v1, "[0-9]{1,3}\\.{1}[0-9]{1,3}\\.{1}[0-9]{1,3}\\.{1}[0-9]{1,3}"

    invoke-virtual {p0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1166
    const/4 v0, 0x3

    goto :goto_0

    .line 1167
    :cond_2
    const-string v1, "\\+?[0-9|\\.|\\-]+"

    invoke-virtual {p0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 1169
    const/4 v0, 0x1

    goto :goto_0

    .line 1170
    :cond_3
    const-string v1, "[a-zA-Z| ]*\\<{0,1}[a-zA-Z| ]+@{1}[a-zA-Z| ]+\\.{1}[a-zA-Z| ]+\\>{0,1}"

    invoke-virtual {p0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 1172
    const/4 v0, 0x2

    goto :goto_0

    .line 1173
    :cond_4
    const-string v1, "[a-fA-F]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}"

    invoke-virtual {p0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1175
    const/4 v0, 0x4

    goto :goto_0
.end method

.method private d()I
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 732
    iget-object v2, p0, Landroid_src/mms/e/k;->a:Ljava/io/ByteArrayOutputStream;

    if-nez v2, :cond_0

    .line 733
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object v2, p0, Landroid_src/mms/e/k;->a:Ljava/io/ByteArrayOutputStream;

    .line 734
    iput v1, p0, Landroid_src/mms/e/k;->b:I

    .line 738
    :cond_0
    const/16 v2, 0x8c

    invoke-virtual {p0, v2}, Landroid_src/mms/e/k;->c(I)V

    .line 739
    const/16 v2, 0x85

    invoke-virtual {p0, v2}, Landroid_src/mms/e/k;->c(I)V

    .line 742
    const/16 v2, 0x98

    invoke-direct {p0, v2}, Landroid_src/mms/e/k;->e(I)I

    move-result v2

    if-eqz v2, :cond_2

    .line 754
    :cond_1
    :goto_0
    return v0

    .line 747
    :cond_2
    const/16 v2, 0x8d

    invoke-direct {p0, v2}, Landroid_src/mms/e/k;->e(I)I

    move-result v2

    if-nez v2, :cond_1

    .line 752
    const/16 v0, 0x91

    invoke-direct {p0, v0}, Landroid_src/mms/e/k;->e(I)I

    move v0, v1

    .line 754
    goto :goto_0
.end method

.method private e()I
    .locals 4

    .prologue
    const/16 v3, 0x98

    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 761
    iget-object v0, p0, Landroid_src/mms/e/k;->a:Ljava/io/ByteArrayOutputStream;

    if-nez v0, :cond_0

    .line 762
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object v0, p0, Landroid_src/mms/e/k;->a:Ljava/io/ByteArrayOutputStream;

    .line 763
    iput v2, p0, Landroid_src/mms/e/k;->b:I

    .line 767
    :cond_0
    const/16 v0, 0x8c

    invoke-virtual {p0, v0}, Landroid_src/mms/e/k;->c(I)V

    .line 768
    const/16 v0, 0x80

    invoke-virtual {p0, v0}, Landroid_src/mms/e/k;->c(I)V

    .line 771
    invoke-virtual {p0, v3}, Landroid_src/mms/e/k;->c(I)V

    .line 773
    iget-object v0, p0, Landroid_src/mms/e/k;->g:Landroid_src/mms/e/q;

    invoke-virtual {v0, v3}, Landroid_src/mms/e/q;->b(I)[B

    move-result-object v0

    .line 774
    if-nez v0, :cond_1

    .line 776
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Transaction-ID is null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 778
    :cond_1
    invoke-virtual {p0, v0}, Landroid_src/mms/e/k;->a([B)V

    .line 781
    const/16 v0, 0x8d

    invoke-direct {p0, v0}, Landroid_src/mms/e/k;->e(I)I

    move-result v0

    if-eqz v0, :cond_3

    .line 840
    :cond_2
    :goto_0
    return v1

    .line 786
    :cond_3
    const/16 v0, 0x85

    invoke-direct {p0, v0}, Landroid_src/mms/e/k;->e(I)I

    .line 789
    const/16 v0, 0x89

    invoke-direct {p0, v0}, Landroid_src/mms/e/k;->e(I)I

    move-result v0

    if-nez v0, :cond_2

    .line 796
    const/16 v0, 0x97

    invoke-direct {p0, v0}, Landroid_src/mms/e/k;->e(I)I

    move-result v0

    if-eq v0, v1, :cond_6

    move v0, v1

    .line 801
    :goto_1
    const/16 v3, 0x82

    invoke-direct {p0, v3}, Landroid_src/mms/e/k;->e(I)I

    move-result v3

    if-eq v3, v1, :cond_4

    move v0, v1

    .line 806
    :cond_4
    const/16 v3, 0x81

    invoke-direct {p0, v3}, Landroid_src/mms/e/k;->e(I)I

    move-result v3

    if-eq v3, v1, :cond_5

    move v0, v1

    .line 811
    :cond_5
    if-eqz v0, :cond_2

    .line 816
    const/16 v0, 0x96

    invoke-direct {p0, v0}, Landroid_src/mms/e/k;->e(I)I

    .line 820
    const/16 v0, 0x8a

    invoke-direct {p0, v0}, Landroid_src/mms/e/k;->e(I)I

    .line 823
    const/16 v0, 0x88

    invoke-direct {p0, v0}, Landroid_src/mms/e/k;->e(I)I

    .line 826
    const/16 v0, 0x8f

    invoke-direct {p0, v0}, Landroid_src/mms/e/k;->e(I)I

    .line 829
    const/16 v0, 0x86

    invoke-direct {p0, v0}, Landroid_src/mms/e/k;->e(I)I

    .line 832
    const/16 v0, 0x90

    invoke-direct {p0, v0}, Landroid_src/mms/e/k;->e(I)I

    .line 835
    const/16 v0, 0x84

    invoke-virtual {p0, v0}, Landroid_src/mms/e/k;->c(I)V

    .line 838
    invoke-direct {p0}, Landroid_src/mms/e/k;->f()I

    move v1, v2

    .line 840
    goto :goto_0

    :cond_6
    move v0, v2

    goto :goto_1
.end method

.method private e(I)I
    .locals 7

    .prologue
    const/16 v5, 0x80

    const/4 v1, 0x0

    const/16 v6, 0x81

    const/4 v2, 0x1

    const/4 v0, 0x2

    .line 482
    packed-switch p1, :pswitch_data_0

    .line 642
    :pswitch_0
    const/4 v1, 0x3

    .line 645
    :cond_0
    :goto_0
    return v1

    .line 484
    :pswitch_1
    invoke-virtual {p0, p1}, Landroid_src/mms/e/k;->c(I)V

    .line 486
    iget-object v0, p0, Landroid_src/mms/e/k;->g:Landroid_src/mms/e/q;

    invoke-virtual {v0, p1}, Landroid_src/mms/e/q;->a(I)I

    move-result v0

    .line 487
    if-nez v0, :cond_1

    .line 488
    const/16 v0, 0x12

    invoke-virtual {p0, v0}, Landroid_src/mms/e/k;->b(I)V

    goto :goto_0

    .line 490
    :cond_1
    invoke-virtual {p0, v0}, Landroid_src/mms/e/k;->b(I)V

    goto :goto_0

    .line 497
    :pswitch_2
    iget-object v2, p0, Landroid_src/mms/e/k;->g:Landroid_src/mms/e/q;

    invoke-virtual {v2, p1}, Landroid_src/mms/e/q;->b(I)[B

    move-result-object v2

    .line 498
    if-nez v2, :cond_2

    move v1, v0

    .line 499
    goto :goto_0

    .line 502
    :cond_2
    invoke-virtual {p0, p1}, Landroid_src/mms/e/k;->c(I)V

    .line 503
    invoke-virtual {p0, v2}, Landroid_src/mms/e/k;->a([B)V

    goto :goto_0

    .line 509
    :pswitch_3
    iget-object v3, p0, Landroid_src/mms/e/k;->g:Landroid_src/mms/e/q;

    invoke-virtual {v3, p1}, Landroid_src/mms/e/q;->d(I)[Landroid_src/mms/e/e;

    move-result-object v3

    .line 511
    if-nez v3, :cond_3

    move v1, v0

    .line 512
    goto :goto_0

    :cond_3
    move v0, v1

    .line 516
    :goto_1
    array-length v4, v3

    if-ge v0, v4, :cond_0

    .line 517
    aget-object v4, v3, v0

    invoke-direct {p0, v4}, Landroid_src/mms/e/k;->b(Landroid_src/mms/e/e;)Landroid_src/mms/e/e;

    move-result-object v4

    .line 518
    if-nez v4, :cond_4

    move v1, v2

    .line 519
    goto :goto_0

    .line 522
    :cond_4
    invoke-virtual {p0, p1}, Landroid_src/mms/e/k;->c(I)V

    .line 523
    invoke-virtual {p0, v4}, Landroid_src/mms/e/k;->a(Landroid_src/mms/e/e;)V

    .line 516
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 529
    :pswitch_4
    invoke-virtual {p0, p1}, Landroid_src/mms/e/k;->c(I)V

    .line 531
    iget-object v0, p0, Landroid_src/mms/e/k;->g:Landroid_src/mms/e/q;

    invoke-virtual {v0, p1}, Landroid_src/mms/e/q;->c(I)Landroid_src/mms/e/e;

    move-result-object v0

    .line 532
    if-eqz v0, :cond_5

    invoke-virtual {v0}, Landroid_src/mms/e/e;->c()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_5

    new-instance v3, Ljava/lang/String;

    invoke-virtual {v0}, Landroid_src/mms/e/e;->b()[B

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/String;-><init>([B)V

    const-string v4, "insert-address-token"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 537
    :cond_5
    invoke-virtual {p0, v2}, Landroid_src/mms/e/k;->a(I)V

    .line 539
    invoke-virtual {p0, v6}, Landroid_src/mms/e/k;->a(I)V

    goto :goto_0

    .line 541
    :cond_6
    iget-object v3, p0, Landroid_src/mms/e/k;->e:Landroid_src/mms/e/m;

    invoke-virtual {v3}, Landroid_src/mms/e/m;->a()V

    .line 542
    iget-object v3, p0, Landroid_src/mms/e/k;->e:Landroid_src/mms/e/m;

    invoke-virtual {v3}, Landroid_src/mms/e/m;->d()Landroid_src/mms/e/o;

    move-result-object v3

    .line 545
    invoke-virtual {p0, v5}, Landroid_src/mms/e/k;->a(I)V

    .line 547
    invoke-direct {p0, v0}, Landroid_src/mms/e/k;->b(Landroid_src/mms/e/e;)Landroid_src/mms/e/e;

    move-result-object v0

    .line 548
    if-nez v0, :cond_7

    move v1, v2

    .line 549
    goto/16 :goto_0

    .line 552
    :cond_7
    invoke-virtual {p0, v0}, Landroid_src/mms/e/k;->a(Landroid_src/mms/e/e;)V

    .line 554
    invoke-virtual {v3}, Landroid_src/mms/e/o;->a()I

    move-result v0

    .line 555
    iget-object v2, p0, Landroid_src/mms/e/k;->e:Landroid_src/mms/e/m;

    invoke-virtual {v2}, Landroid_src/mms/e/m;->b()V

    .line 556
    int-to-long v2, v0

    invoke-virtual {p0, v2, v3}, Landroid_src/mms/e/k;->d(J)V

    .line 557
    iget-object v0, p0, Landroid_src/mms/e/k;->e:Landroid_src/mms/e/m;

    invoke-virtual {v0}, Landroid_src/mms/e/m;->c()V

    goto/16 :goto_0

    .line 567
    :pswitch_5
    iget-object v2, p0, Landroid_src/mms/e/k;->g:Landroid_src/mms/e/q;

    invoke-virtual {v2, p1}, Landroid_src/mms/e/q;->a(I)I

    move-result v2

    .line 568
    if-nez v2, :cond_8

    move v1, v0

    .line 569
    goto/16 :goto_0

    .line 572
    :cond_8
    invoke-virtual {p0, p1}, Landroid_src/mms/e/k;->c(I)V

    .line 573
    invoke-virtual {p0, v2}, Landroid_src/mms/e/k;->c(I)V

    goto/16 :goto_0

    .line 577
    :pswitch_6
    iget-object v2, p0, Landroid_src/mms/e/k;->g:Landroid_src/mms/e/q;

    invoke-virtual {v2, p1}, Landroid_src/mms/e/q;->e(I)J

    move-result-wide v2

    .line 578
    const-wide/16 v4, -0x1

    cmp-long v4, v4, v2

    if-nez v4, :cond_9

    move v1, v0

    .line 579
    goto/16 :goto_0

    .line 582
    :cond_9
    invoke-virtual {p0, p1}, Landroid_src/mms/e/k;->c(I)V

    .line 583
    invoke-virtual {p0, v2, v3}, Landroid_src/mms/e/k;->c(J)V

    goto/16 :goto_0

    .line 587
    :pswitch_7
    iget-object v2, p0, Landroid_src/mms/e/k;->g:Landroid_src/mms/e/q;

    invoke-virtual {v2, p1}, Landroid_src/mms/e/q;->c(I)Landroid_src/mms/e/e;

    move-result-object v2

    .line 589
    if-nez v2, :cond_a

    move v1, v0

    .line 590
    goto/16 :goto_0

    .line 593
    :cond_a
    invoke-virtual {p0, p1}, Landroid_src/mms/e/k;->c(I)V

    .line 594
    invoke-virtual {p0, v2}, Landroid_src/mms/e/k;->a(Landroid_src/mms/e/e;)V

    goto/16 :goto_0

    .line 598
    :pswitch_8
    iget-object v2, p0, Landroid_src/mms/e/k;->g:Landroid_src/mms/e/q;

    invoke-virtual {v2, p1}, Landroid_src/mms/e/q;->b(I)[B

    move-result-object v2

    .line 599
    if-nez v2, :cond_b

    move v1, v0

    .line 600
    goto/16 :goto_0

    .line 603
    :cond_b
    invoke-virtual {p0, p1}, Landroid_src/mms/e/k;->c(I)V

    .line 604
    const-string v0, "advertisement"

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-static {v2, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 606
    invoke-virtual {p0, v6}, Landroid_src/mms/e/k;->c(I)V

    goto/16 :goto_0

    .line 607
    :cond_c
    const-string v0, "auto"

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-static {v2, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 609
    const/16 v0, 0x83

    invoke-virtual {p0, v0}, Landroid_src/mms/e/k;->c(I)V

    goto/16 :goto_0

    .line 610
    :cond_d
    const-string v0, "personal"

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-static {v2, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 612
    invoke-virtual {p0, v5}, Landroid_src/mms/e/k;->c(I)V

    goto/16 :goto_0

    .line 613
    :cond_e
    const-string v0, "informational"

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-static {v2, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 615
    const/16 v0, 0x82

    invoke-virtual {p0, v0}, Landroid_src/mms/e/k;->c(I)V

    goto/16 :goto_0

    .line 617
    :cond_f
    invoke-virtual {p0, v2}, Landroid_src/mms/e/k;->a([B)V

    goto/16 :goto_0

    .line 622
    :pswitch_9
    iget-object v2, p0, Landroid_src/mms/e/k;->g:Landroid_src/mms/e/q;

    invoke-virtual {v2, p1}, Landroid_src/mms/e/q;->e(I)J

    move-result-wide v2

    .line 623
    const-wide/16 v4, -0x1

    cmp-long v4, v4, v2

    if-nez v4, :cond_10

    move v1, v0

    .line 624
    goto/16 :goto_0

    .line 627
    :cond_10
    invoke-virtual {p0, p1}, Landroid_src/mms/e/k;->c(I)V

    .line 629
    iget-object v0, p0, Landroid_src/mms/e/k;->e:Landroid_src/mms/e/m;

    invoke-virtual {v0}, Landroid_src/mms/e/m;->a()V

    .line 630
    iget-object v0, p0, Landroid_src/mms/e/k;->e:Landroid_src/mms/e/m;

    invoke-virtual {v0}, Landroid_src/mms/e/m;->d()Landroid_src/mms/e/o;

    move-result-object v0

    .line 632
    invoke-virtual {p0, v6}, Landroid_src/mms/e/k;->a(I)V

    .line 633
    invoke-virtual {p0, v2, v3}, Landroid_src/mms/e/k;->a(J)V

    .line 635
    invoke-virtual {v0}, Landroid_src/mms/e/o;->a()I

    move-result v0

    .line 636
    iget-object v2, p0, Landroid_src/mms/e/k;->e:Landroid_src/mms/e/m;

    invoke-virtual {v2}, Landroid_src/mms/e/m;->b()V

    .line 637
    int-to-long v2, v0

    invoke-virtual {p0, v2, v3}, Landroid_src/mms/e/k;->d(J)V

    .line 638
    iget-object v0, p0, Landroid_src/mms/e/k;->e:Landroid_src/mms/e/m;

    invoke-virtual {v0}, Landroid_src/mms/e/m;->c()V

    goto/16 :goto_0

    .line 482
    nop

    :pswitch_data_0
    .packed-switch 0x81
        :pswitch_3
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_9
        :pswitch_4
        :pswitch_8
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_5
        :pswitch_7
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_5
    .end packed-switch
.end method

.method private f()I
    .locals 15

    .prologue
    const/16 v14, 0x3e

    const/16 v13, 0x3c

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 848
    iget-object v0, p0, Landroid_src/mms/e/k;->e:Landroid_src/mms/e/m;

    invoke-virtual {v0}, Landroid_src/mms/e/m;->a()V

    .line 850
    iget-object v0, p0, Landroid_src/mms/e/k;->e:Landroid_src/mms/e/m;

    invoke-virtual {v0}, Landroid_src/mms/e/m;->d()Landroid_src/mms/e/o;

    move-result-object v3

    .line 853
    new-instance v0, Ljava/lang/String;

    iget-object v4, p0, Landroid_src/mms/e/k;->g:Landroid_src/mms/e/q;

    const/16 v5, 0x84

    invoke-virtual {v4, v5}, Landroid_src/mms/e/q;->b(I)[B

    move-result-object v4

    invoke-direct {v0, v4}, Ljava/lang/String;-><init>([B)V

    .line 854
    sget-object v4, Landroid_src/mms/e/k;->h:Ljava/util/HashMap;

    invoke-virtual {v4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 855
    if-nez v0, :cond_0

    move v0, v1

    .line 1019
    :goto_0
    return v0

    .line 860
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Landroid_src/mms/e/k;->b(I)V

    .line 863
    iget-object v0, p0, Landroid_src/mms/e/k;->d:Landroid_src/mms/e/f;

    check-cast v0, Landroid_src/mms/e/z;

    invoke-virtual {v0}, Landroid_src/mms/e/z;->a()Landroid_src/mms/e/j;

    move-result-object v4

    .line 864
    if-eqz v4, :cond_1

    invoke-virtual {v4}, Landroid_src/mms/e/j;->b()I

    move-result v0

    if-nez v0, :cond_2

    .line 866
    :cond_1
    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Landroid_src/mms/e/k;->b(J)V

    .line 867
    iget-object v0, p0, Landroid_src/mms/e/k;->e:Landroid_src/mms/e/m;

    invoke-virtual {v0}, Landroid_src/mms/e/m;->b()V

    .line 868
    iget-object v0, p0, Landroid_src/mms/e/k;->e:Landroid_src/mms/e/m;

    invoke-virtual {v0}, Landroid_src/mms/e/m;->c()V

    move v0, v2

    .line 869
    goto :goto_0

    .line 874
    :cond_2
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {v4, v0}, Landroid_src/mms/e/j;->a(I)Landroid_src/mms/e/s;

    move-result-object v0

    .line 876
    invoke-virtual {v0}, Landroid_src/mms/e/s;->c()[B

    move-result-object v5

    .line 877
    if-eqz v5, :cond_3

    .line 878
    const/16 v6, 0x8a

    invoke-virtual {p0, v6}, Landroid_src/mms/e/k;->c(I)V

    .line 879
    const/4 v6, 0x0

    aget-byte v6, v5, v6

    if-ne v13, v6, :cond_4

    array-length v6, v5

    add-int/lit8 v6, v6, -0x1

    aget-byte v6, v5, v6

    if-ne v14, v6, :cond_4

    .line 880
    invoke-virtual {p0, v5}, Landroid_src/mms/e/k;->a([B)V

    .line 887
    :cond_3
    :goto_1
    const/16 v5, 0x89

    invoke-virtual {p0, v5}, Landroid_src/mms/e/k;->c(I)V

    .line 888
    invoke-virtual {v0}, Landroid_src/mms/e/s;->g()[B

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid_src/mms/e/k;->a([B)V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 894
    :goto_2
    invoke-virtual {v3}, Landroid_src/mms/e/o;->a()I

    move-result v0

    .line 895
    iget-object v3, p0, Landroid_src/mms/e/k;->e:Landroid_src/mms/e/m;

    invoke-virtual {v3}, Landroid_src/mms/e/m;->b()V

    .line 896
    int-to-long v5, v0

    invoke-virtual {p0, v5, v6}, Landroid_src/mms/e/k;->d(J)V

    .line 897
    iget-object v0, p0, Landroid_src/mms/e/k;->e:Landroid_src/mms/e/m;

    invoke-virtual {v0}, Landroid_src/mms/e/m;->c()V

    .line 900
    invoke-virtual {v4}, Landroid_src/mms/e/j;->b()I

    move-result v5

    .line 901
    int-to-long v6, v5

    invoke-virtual {p0, v6, v7}, Landroid_src/mms/e/k;->b(J)V

    move v3, v2

    .line 902
    :goto_3
    if-ge v3, v5, :cond_f

    .line 903
    invoke-virtual {v4, v3}, Landroid_src/mms/e/j;->a(I)Landroid_src/mms/e/s;

    move-result-object v6

    .line 904
    iget-object v0, p0, Landroid_src/mms/e/k;->e:Landroid_src/mms/e/m;

    invoke-virtual {v0}, Landroid_src/mms/e/m;->a()V

    .line 905
    iget-object v0, p0, Landroid_src/mms/e/k;->e:Landroid_src/mms/e/m;

    invoke-virtual {v0}, Landroid_src/mms/e/m;->d()Landroid_src/mms/e/o;

    move-result-object v7

    .line 907
    iget-object v0, p0, Landroid_src/mms/e/k;->e:Landroid_src/mms/e/m;

    invoke-virtual {v0}, Landroid_src/mms/e/m;->a()V

    .line 908
    iget-object v0, p0, Landroid_src/mms/e/k;->e:Landroid_src/mms/e/m;

    invoke-virtual {v0}, Landroid_src/mms/e/m;->d()Landroid_src/mms/e/o;

    move-result-object v8

    .line 910
    invoke-virtual {v6}, Landroid_src/mms/e/s;->g()[B

    move-result-object v9

    .line 912
    if-nez v9, :cond_5

    move v0, v1

    .line 914
    goto/16 :goto_0

    .line 882
    :cond_4
    :try_start_1
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "<"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    new-instance v7, Ljava/lang/String;

    invoke-direct {v7, v5}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, ">"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0, v5}, Landroid_src/mms/e/k;->a(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    .line 890
    :catch_0
    move-exception v0

    .line 891
    invoke-virtual {v0}, Ljava/lang/ArrayIndexOutOfBoundsException;->printStackTrace()V

    goto :goto_2

    .line 918
    :cond_5
    sget-object v0, Landroid_src/mms/e/k;->h:Ljava/util/HashMap;

    new-instance v10, Ljava/lang/String;

    invoke-direct {v10, v9}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v0, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 920
    if-nez v0, :cond_6

    .line 921
    invoke-virtual {p0, v9}, Landroid_src/mms/e/k;->a([B)V

    .line 930
    :goto_4
    invoke-virtual {v6}, Landroid_src/mms/e/s;->i()[B

    move-result-object v0

    .line 932
    if-nez v0, :cond_7

    .line 933
    invoke-virtual {v6}, Landroid_src/mms/e/s;->j()[B

    move-result-object v0

    .line 935
    if-nez v0, :cond_7

    .line 936
    invoke-virtual {v6}, Landroid_src/mms/e/s;->e()[B

    move-result-object v0

    .line 938
    if-nez v0, :cond_7

    move v0, v1

    .line 942
    goto/16 :goto_0

    .line 923
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Landroid_src/mms/e/k;->b(I)V

    goto :goto_4

    .line 946
    :cond_7
    const/16 v9, 0x85

    invoke-virtual {p0, v9}, Landroid_src/mms/e/k;->c(I)V

    .line 947
    invoke-virtual {p0, v0}, Landroid_src/mms/e/k;->a([B)V

    .line 950
    invoke-virtual {v6}, Landroid_src/mms/e/s;->d()I

    move-result v0

    .line 951
    if-eqz v0, :cond_8

    .line 952
    const/16 v9, 0x81

    invoke-virtual {p0, v9}, Landroid_src/mms/e/k;->c(I)V

    .line 953
    invoke-virtual {p0, v0}, Landroid_src/mms/e/k;->b(I)V

    .line 956
    :cond_8
    invoke-virtual {v8}, Landroid_src/mms/e/o;->a()I

    move-result v0

    .line 957
    iget-object v8, p0, Landroid_src/mms/e/k;->e:Landroid_src/mms/e/m;

    invoke-virtual {v8}, Landroid_src/mms/e/m;->b()V

    .line 958
    int-to-long v8, v0

    invoke-virtual {p0, v8, v9}, Landroid_src/mms/e/k;->d(J)V

    .line 959
    iget-object v0, p0, Landroid_src/mms/e/k;->e:Landroid_src/mms/e/m;

    invoke-virtual {v0}, Landroid_src/mms/e/m;->c()V

    .line 962
    invoke-virtual {v6}, Landroid_src/mms/e/s;->c()[B

    move-result-object v0

    .line 964
    if-eqz v0, :cond_9

    .line 965
    const/16 v8, 0xc0

    invoke-virtual {p0, v8}, Landroid_src/mms/e/k;->c(I)V

    .line 966
    aget-byte v8, v0, v2

    if-ne v13, v8, :cond_c

    array-length v8, v0

    add-int/lit8 v8, v8, -0x1

    aget-byte v8, v0, v8

    if-ne v14, v8, :cond_c

    .line 967
    invoke-virtual {p0, v0}, Landroid_src/mms/e/k;->b([B)V

    .line 974
    :cond_9
    :goto_5
    invoke-virtual {v6}, Landroid_src/mms/e/s;->e()[B

    move-result-object v0

    .line 975
    if-eqz v0, :cond_a

    .line 976
    const/16 v8, 0x8e

    invoke-virtual {p0, v8}, Landroid_src/mms/e/k;->c(I)V

    .line 977
    invoke-virtual {p0, v0}, Landroid_src/mms/e/k;->a([B)V

    .line 981
    :cond_a
    invoke-virtual {v7}, Landroid_src/mms/e/o;->a()I

    move-result v8

    .line 984
    invoke-virtual {v6}, Landroid_src/mms/e/s;->a()[B

    move-result-object v0

    .line 986
    if-eqz v0, :cond_d

    .line 987
    array-length v6, v0

    invoke-virtual {p0, v0, v2, v6}, Landroid_src/mms/e/k;->a([BII)V

    .line 988
    array-length v0, v0

    .line 1009
    :cond_b
    invoke-virtual {v7}, Landroid_src/mms/e/o;->a()I

    move-result v6

    sub-int/2addr v6, v8

    if-eq v0, v6, :cond_e

    .line 1010
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "BUG: Length sanity check failed"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 969
    :cond_c
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "<"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    new-instance v9, Ljava/lang/String;

    invoke-direct {v9, v0}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v8, ">"

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid_src/mms/e/k;->b(Ljava/lang/String;)V

    goto :goto_5

    .line 992
    :cond_d
    const/16 v0, 0x400

    :try_start_2
    new-array v9, v0, [B

    .line 993
    iget-object v0, p0, Landroid_src/mms/e/k;->f:Landroid/content/ContentResolver;

    invoke-virtual {v6}, Landroid_src/mms/e/s;->b()Landroid/net/Uri;

    move-result-object v6

    invoke-virtual {v0, v6}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v6

    move v0, v2

    .line 995
    :goto_6
    invoke-virtual {v6, v9}, Ljava/io/InputStream;->read([B)I

    move-result v10

    const/4 v11, -0x1

    if-eq v10, v11, :cond_b

    .line 996
    iget-object v11, p0, Landroid_src/mms/e/k;->a:Ljava/io/ByteArrayOutputStream;

    const/4 v12, 0x0

    invoke-virtual {v11, v9, v12, v10}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 997
    iget v11, p0, Landroid_src/mms/e/k;->b:I

    add-int/2addr v11, v10

    iput v11, p0, Landroid_src/mms/e/k;->b:I
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_3

    .line 998
    add-int/2addr v0, v10

    goto :goto_6

    .line 1000
    :catch_1
    move-exception v0

    move v0, v1

    .line 1001
    goto/16 :goto_0

    .line 1002
    :catch_2
    move-exception v0

    move v0, v1

    .line 1003
    goto/16 :goto_0

    .line 1004
    :catch_3
    move-exception v0

    move v0, v1

    .line 1005
    goto/16 :goto_0

    .line 1013
    :cond_e
    iget-object v6, p0, Landroid_src/mms/e/k;->e:Landroid_src/mms/e/m;

    invoke-virtual {v6}, Landroid_src/mms/e/m;->b()V

    .line 1014
    int-to-long v6, v8

    invoke-virtual {p0, v6, v7}, Landroid_src/mms/e/k;->b(J)V

    .line 1015
    int-to-long v6, v0

    invoke-virtual {p0, v6, v7}, Landroid_src/mms/e/k;->b(J)V

    .line 1016
    iget-object v0, p0, Landroid_src/mms/e/k;->e:Landroid_src/mms/e/m;

    invoke-virtual {v0}, Landroid_src/mms/e/m;->c()V

    .line 902
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto/16 :goto_3

    :cond_f
    move v0, v2

    .line 1019
    goto/16 :goto_0
.end method


# virtual methods
.method protected a(I)V
    .locals 1

    .prologue
    .line 196
    iget-object v0, p0, Landroid_src/mms/e/k;->a:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 197
    iget v0, p0, Landroid_src/mms/e/k;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroid_src/mms/e/k;->b:I

    .line 198
    return-void
.end method

.method protected a(J)V
    .locals 8

    .prologue
    const/16 v7, 0x8

    const/4 v1, 0x0

    .line 258
    move-wide v2, p1

    move v4, v1

    .line 261
    :goto_0
    const-wide/16 v5, 0x0

    cmp-long v0, v2, v5

    if-eqz v0, :cond_0

    if-ge v4, v7, :cond_0

    .line 262
    ushr-long/2addr v2, v7

    .line 261
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_0

    .line 266
    :cond_0
    invoke-virtual {p0, v4}, Landroid_src/mms/e/k;->d(I)V

    .line 270
    add-int/lit8 v0, v4, -0x1

    mul-int/lit8 v0, v0, 0x8

    .line 272
    :goto_1
    if-ge v1, v4, :cond_1

    .line 273
    ushr-long v2, p1, v0

    const-wide/16 v5, 0xff

    and-long/2addr v2, v5

    long-to-int v2, v2

    invoke-virtual {p0, v2}, Landroid_src/mms/e/k;->a(I)V

    .line 274
    add-int/lit8 v0, v0, -0x8

    .line 272
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 276
    :cond_1
    return-void
.end method

.method protected a(Landroid_src/mms/e/e;)V
    .locals 3

    .prologue
    .line 325
    sget-boolean v0, Landroid_src/mms/e/k;->c:Z

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 327
    :cond_0
    invoke-virtual {p1}, Landroid_src/mms/e/e;->a()I

    move-result v0

    .line 328
    invoke-virtual {p1}, Landroid_src/mms/e/e;->b()[B

    move-result-object v1

    .line 329
    if-nez v1, :cond_1

    .line 348
    :goto_0
    return-void

    .line 338
    :cond_1
    iget-object v2, p0, Landroid_src/mms/e/k;->e:Landroid_src/mms/e/m;

    invoke-virtual {v2}, Landroid_src/mms/e/m;->a()V

    .line 339
    iget-object v2, p0, Landroid_src/mms/e/k;->e:Landroid_src/mms/e/m;

    invoke-virtual {v2}, Landroid_src/mms/e/m;->d()Landroid_src/mms/e/o;

    move-result-object v2

    .line 341
    invoke-virtual {p0, v0}, Landroid_src/mms/e/k;->b(I)V

    .line 342
    invoke-virtual {p0, v1}, Landroid_src/mms/e/k;->a([B)V

    .line 344
    invoke-virtual {v2}, Landroid_src/mms/e/o;->a()I

    move-result v0

    .line 345
    iget-object v1, p0, Landroid_src/mms/e/k;->e:Landroid_src/mms/e/m;

    invoke-virtual {v1}, Landroid_src/mms/e/m;->b()V

    .line 346
    int-to-long v0, v0

    invoke-virtual {p0, v0, v1}, Landroid_src/mms/e/k;->d(J)V

    .line 347
    iget-object v0, p0, Landroid_src/mms/e/k;->e:Landroid_src/mms/e/m;

    invoke-virtual {v0}, Landroid_src/mms/e/m;->c()V

    goto :goto_0
.end method

.method protected a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 312
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid_src/mms/e/k;->a([B)V

    .line 313
    return-void
.end method

.method protected a([B)V
    .locals 3

    .prologue
    const/16 v2, 0x7f

    const/4 v1, 0x0

    .line 291
    aget-byte v0, p1, v1

    and-int/lit16 v0, v0, 0xff

    if-le v0, v2, :cond_0

    .line 292
    invoke-virtual {p0, v2}, Landroid_src/mms/e/k;->a(I)V

    .line 295
    :cond_0
    array-length v0, p1

    invoke-virtual {p0, p1, v1, v0}, Landroid_src/mms/e/k;->a([BII)V

    .line 296
    invoke-virtual {p0, v1}, Landroid_src/mms/e/k;->a(I)V

    .line 297
    return-void
.end method

.method protected a([BII)V
    .locals 1

    .prologue
    .line 188
    iget-object v0, p0, Landroid_src/mms/e/k;->a:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 189
    iget v0, p0, Landroid_src/mms/e/k;->b:I

    add-int/2addr v0, p3

    iput v0, p0, Landroid_src/mms/e/k;->b:I

    .line 190
    return-void
.end method

.method public a()[B
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 153
    iget-object v1, p0, Landroid_src/mms/e/k;->d:Landroid_src/mms/e/f;

    invoke-virtual {v1}, Landroid_src/mms/e/f;->f()I

    move-result v1

    .line 156
    packed-switch v1, :pswitch_data_0

    .line 181
    :cond_0
    :goto_0
    :pswitch_0
    return-object v0

    .line 158
    :pswitch_1
    invoke-direct {p0}, Landroid_src/mms/e/k;->e()I

    move-result v1

    if-nez v1, :cond_0

    .line 181
    :cond_1
    iget-object v0, p0, Landroid_src/mms/e/k;->a:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    goto :goto_0

    .line 163
    :pswitch_2
    invoke-direct {p0}, Landroid_src/mms/e/k;->c()I

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 168
    :pswitch_3
    invoke-direct {p0}, Landroid_src/mms/e/k;->d()I

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 173
    :pswitch_4
    invoke-direct {p0}, Landroid_src/mms/e/k;->b()I

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 156
    nop

    :pswitch_data_0
    .packed-switch 0x80
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_4
    .end packed-switch
.end method

.method protected b(I)V
    .locals 1

    .prologue
    .line 215
    or-int/lit16 v0, p1, 0x80

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p0, v0}, Landroid_src/mms/e/k;->a(I)V

    .line 216
    return-void
.end method

.method protected b(J)V
    .locals 7

    .prologue
    const-wide/16 v3, 0x7f

    .line 365
    .line 367
    const/4 v0, 0x0

    move-wide v1, v3

    :goto_0
    const/4 v5, 0x5

    if-ge v0, v5, :cond_0

    .line 368
    cmp-long v5, p1, v1

    if-gez v5, :cond_1

    .line 375
    :cond_0
    :goto_1
    if-lez v0, :cond_2

    .line 376
    mul-int/lit8 v1, v0, 0x7

    ushr-long v1, p1, v1

    .line 377
    and-long/2addr v1, v3

    .line 379
    const-wide/16 v5, 0x80

    or-long/2addr v1, v5

    const-wide/16 v5, 0xff

    and-long/2addr v1, v5

    long-to-int v1, v1

    invoke-virtual {p0, v1}, Landroid_src/mms/e/k;->a(I)V

    .line 381
    add-int/lit8 v0, v0, -0x1

    .line 382
    goto :goto_1

    .line 372
    :cond_1
    const/4 v5, 0x7

    shl-long/2addr v1, v5

    or-long/2addr v1, v3

    .line 367
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 384
    :cond_2
    and-long v0, p1, v3

    long-to-int v0, v0

    invoke-virtual {p0, v0}, Landroid_src/mms/e/k;->a(I)V

    .line 385
    return-void
.end method

.method protected b(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 452
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid_src/mms/e/k;->b([B)V

    .line 453
    return-void
.end method

.method protected b([B)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 435
    const/16 v0, 0x22

    invoke-virtual {p0, v0}, Landroid_src/mms/e/k;->a(I)V

    .line 436
    array-length v0, p1

    invoke-virtual {p0, p1, v1, v0}, Landroid_src/mms/e/k;->a([BII)V

    .line 437
    invoke-virtual {p0, v1}, Landroid_src/mms/e/k;->a(I)V

    .line 438
    return-void
.end method

.method protected c(I)V
    .locals 0

    .prologue
    .line 226
    invoke-virtual {p0, p1}, Landroid_src/mms/e/k;->a(I)V

    .line 227
    return-void
.end method

.method protected c(J)V
    .locals 0

    .prologue
    .line 397
    invoke-virtual {p0, p1, p2}, Landroid_src/mms/e/k;->a(J)V

    .line 398
    return-void
.end method

.method protected d(I)V
    .locals 0

    .prologue
    .line 239
    invoke-virtual {p0, p1}, Landroid_src/mms/e/k;->a(I)V

    .line 240
    return-void
.end method

.method protected d(J)V
    .locals 2

    .prologue
    .line 414
    const-wide/16 v0, 0x1f

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    .line 415
    long-to-int v0, p1

    invoke-virtual {p0, v0}, Landroid_src/mms/e/k;->d(I)V

    .line 421
    :goto_0
    return-void

    .line 419
    :cond_0
    const/16 v0, 0x1f

    invoke-virtual {p0, v0}, Landroid_src/mms/e/k;->a(I)V

    .line 420
    invoke-virtual {p0, p1, p2}, Landroid_src/mms/e/k;->b(J)V

    goto :goto_0
.end method
