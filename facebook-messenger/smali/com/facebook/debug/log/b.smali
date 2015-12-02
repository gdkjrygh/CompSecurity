.class public Lcom/facebook/debug/log/b;
.super Ljava/lang/Object;
.source "BLog.java"


# static fields
.field private static a:Lcom/facebook/debug/log/c;

.field private static volatile b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 43
    const/4 v0, 0x2

    sput v0, Lcom/facebook/debug/log/b;->b:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)V
    .locals 0

    .prologue
    .line 46
    sput p0, Lcom/facebook/debug/log/b;->b:I

    .line 47
    return-void
.end method

.method public static a(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 798
    sget v0, Lcom/facebook/debug/log/b;->b:I

    if-gt v0, p0, :cond_0

    .line 799
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    if-eqz v0, :cond_1

    .line 800
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    invoke-interface {v0, p0, p1, p2}, Lcom/facebook/debug/log/c;->a(ILjava/lang/String;Ljava/lang/String;)I

    .line 805
    :cond_0
    :goto_0
    return-void

    .line 802
    :cond_1
    invoke-static {p0, p1, p2}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public static a(Lcom/facebook/debug/log/c;)V
    .locals 0

    .prologue
    .line 50
    sput-object p0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    .line 51
    return-void
.end method

.method public static a(Lcom/facebook/debug/log/l;Ljava/lang/Class;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/debug/log/l;",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 668
    sget v0, Lcom/facebook/debug/log/b;->b:I

    const/4 v1, 0x6

    if-gt v0, v1, :cond_0

    .line 669
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    if-eqz v0, :cond_1

    .line 670
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    invoke-static {p1}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p0, v1, p2}, Lcom/facebook/debug/log/c;->a(Lcom/facebook/debug/log/l;Ljava/lang/String;Ljava/lang/String;)I

    .line 675
    :cond_0
    :goto_0
    return-void

    .line 672
    :cond_1
    invoke-static {p1}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public static a(Lcom/facebook/debug/log/l;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/debug/log/l;",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/String;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    .prologue
    .line 788
    sget v0, Lcom/facebook/debug/log/b;->b:I

    const/4 v1, 0x6

    if-gt v0, v1, :cond_0

    .line 789
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    if-eqz v0, :cond_1

    .line 790
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    invoke-static {p1}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p0, v1, p2, p3}, Lcom/facebook/debug/log/c;->a(Lcom/facebook/debug/log/l;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 795
    :cond_0
    :goto_0
    return-void

    .line 792
    :cond_1
    invoke-static {p1}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2, p3}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public static varargs a(Lcom/facebook/debug/log/l;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/debug/log/l;",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .prologue
    .line 713
    sget v0, Lcom/facebook/debug/log/b;->b:I

    const/4 v1, 0x6

    if-gt v0, v1, :cond_0

    .line 714
    invoke-static {p2, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 715
    sget-object v1, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    if-eqz v1, :cond_1

    .line 716
    sget-object v1, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    invoke-static {p1}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, p0, v2, v0}, Lcom/facebook/debug/log/c;->a(Lcom/facebook/debug/log/l;Ljava/lang/String;Ljava/lang/String;)I

    .line 721
    :cond_0
    :goto_0
    return-void

    .line 718
    :cond_1
    invoke-static {p1}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public static a(Lcom/facebook/debug/log/l;Ljava/lang/Class;Ljava/lang/Throwable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/debug/log/l;",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    .prologue
    .line 750
    sget v0, Lcom/facebook/debug/log/b;->b:I

    const/4 v1, 0x6

    if-gt v0, v1, :cond_0

    .line 751
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    if-eqz v0, :cond_1

    .line 752
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    invoke-static {p1}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p0, v1, p2}, Lcom/facebook/debug/log/c;->a(Lcom/facebook/debug/log/l;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 757
    :cond_0
    :goto_0
    return-void

    .line 754
    :cond_1
    invoke-static {p1}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public static a(Ljava/lang/Class;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 86
    sget v0, Lcom/facebook/debug/log/b;->b:I

    const/4 v1, 0x2

    if-gt v0, v1, :cond_0

    .line 87
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    if-eqz v0, :cond_1

    .line 88
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    invoke-static {p0}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lcom/facebook/debug/log/c;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 93
    :cond_0
    :goto_0
    return-void

    .line 90
    :cond_1
    invoke-static {p0}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public static a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/String;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    .prologue
    .line 160
    sget v0, Lcom/facebook/debug/log/b;->b:I

    const/4 v1, 0x2

    if-gt v0, v1, :cond_0

    .line 161
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    if-eqz v0, :cond_1

    .line 162
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    invoke-static {p0}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1, p2}, Lcom/facebook/debug/log/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 167
    :cond_0
    :goto_0
    return-void

    .line 164
    :cond_1
    invoke-static {p0}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1, p2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public static varargs a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .prologue
    .line 123
    sget v0, Lcom/facebook/debug/log/b;->b:I

    const/4 v1, 0x2

    if-gt v0, v1, :cond_0

    .line 124
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 125
    sget-object v1, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    if-eqz v1, :cond_1

    .line 126
    sget-object v1, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    invoke-static {p0}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Lcom/facebook/debug/log/c;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 131
    :cond_0
    :goto_0
    return-void

    .line 128
    :cond_1
    invoke-static {p0}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public static a(Ljava/lang/Class;Ljava/lang/Throwable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    .prologue
    .line 518
    sget v0, Lcom/facebook/debug/log/b;->b:I

    const/4 v1, 0x5

    if-gt v0, v1, :cond_0

    .line 519
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    if-eqz v0, :cond_1

    .line 520
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    invoke-static {p0}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lcom/facebook/debug/log/c;->a(Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 525
    :cond_0
    :goto_0
    return-void

    .line 522
    :cond_1
    invoke-static {p0}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 69
    sget v0, Lcom/facebook/debug/log/b;->b:I

    const/4 v1, 0x2

    if-gt v0, v1, :cond_0

    .line 70
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    if-eqz v0, :cond_1

    .line 71
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    invoke-interface {v0, p0, p1}, Lcom/facebook/debug/log/c;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 76
    :cond_0
    :goto_0
    return-void

    .line 73
    :cond_1
    invoke-static {p0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 250
    sget v0, Lcom/facebook/debug/log/b;->b:I

    const/4 v1, 0x3

    if-gt v0, v1, :cond_0

    .line 251
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    if-eqz v0, :cond_1

    .line 252
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    invoke-interface {v0, p0, p1, p2}, Lcom/facebook/debug/log/c;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 257
    :cond_0
    :goto_0
    return-void

    .line 254
    :cond_1
    invoke-static {p0, p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public static varargs a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 104
    sget v0, Lcom/facebook/debug/log/b;->b:I

    const/4 v1, 0x2

    if-gt v0, v1, :cond_0

    .line 105
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 106
    sget-object v1, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    if-eqz v1, :cond_1

    .line 107
    sget-object v1, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    invoke-interface {v1, p0, v0}, Lcom/facebook/debug/log/c;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 112
    :cond_0
    :goto_0
    return-void

    .line 109
    :cond_1
    invoke-static {p0, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 501
    sget v0, Lcom/facebook/debug/log/b;->b:I

    const/4 v1, 0x5

    if-gt v0, v1, :cond_0

    .line 502
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    if-eqz v0, :cond_1

    .line 503
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    invoke-interface {v0, p0, p1}, Lcom/facebook/debug/log/c;->a(Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 508
    :cond_0
    :goto_0
    return-void

    .line 505
    :cond_1
    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;I)Z
    .locals 1

    .prologue
    .line 58
    sget v0, Lcom/facebook/debug/log/b;->b:I

    if-lt p1, v0, :cond_0

    invoke-static {p0, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static b(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 808
    sget v0, Lcom/facebook/debug/log/b;->b:I

    if-gt v0, p0, :cond_0

    .line 809
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    if-eqz v0, :cond_1

    .line 810
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    invoke-interface {v0, p0, p1, p2}, Lcom/facebook/debug/log/c;->a(ILjava/lang/String;Ljava/lang/String;)I

    .line 815
    :cond_0
    :goto_0
    return-void

    .line 812
    :cond_1
    invoke-static {p0, p1, p2}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public static b(Ljava/lang/Class;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 194
    sget v0, Lcom/facebook/debug/log/b;->b:I

    const/4 v1, 0x3

    if-gt v0, v1, :cond_0

    .line 195
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    if-eqz v0, :cond_1

    .line 196
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    invoke-static {p0}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lcom/facebook/debug/log/c;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 201
    :cond_0
    :goto_0
    return-void

    .line 198
    :cond_1
    invoke-static {p0}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public static b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/String;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    .prologue
    .line 268
    sget v0, Lcom/facebook/debug/log/b;->b:I

    const/4 v1, 0x3

    if-gt v0, v1, :cond_0

    .line 269
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    if-eqz v0, :cond_1

    .line 270
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    invoke-static {p0}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1, p2}, Lcom/facebook/debug/log/c;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 275
    :cond_0
    :goto_0
    return-void

    .line 272
    :cond_1
    invoke-static {p0}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public static varargs b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .prologue
    .line 231
    sget v0, Lcom/facebook/debug/log/b;->b:I

    const/4 v1, 0x3

    if-gt v0, v1, :cond_0

    .line 232
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 233
    sget-object v1, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    if-eqz v1, :cond_1

    .line 234
    sget-object v1, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    invoke-static {p0}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Lcom/facebook/debug/log/c;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 239
    :cond_0
    :goto_0
    return-void

    .line 236
    :cond_1
    invoke-static {p0}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 177
    sget v0, Lcom/facebook/debug/log/b;->b:I

    const/4 v1, 0x3

    if-gt v0, v1, :cond_0

    .line 178
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    if-eqz v0, :cond_1

    .line 179
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    invoke-interface {v0, p0, p1}, Lcom/facebook/debug/log/c;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 184
    :cond_0
    :goto_0
    return-void

    .line 181
    :cond_1
    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 358
    sget v0, Lcom/facebook/debug/log/b;->b:I

    const/4 v1, 0x4

    if-gt v0, v1, :cond_0

    .line 359
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    if-eqz v0, :cond_1

    .line 360
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    invoke-interface {v0, p0, p1, p2}, Lcom/facebook/debug/log/c;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 365
    :cond_0
    :goto_0
    return-void

    .line 362
    :cond_1
    invoke-static {p0, p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public static varargs b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 428
    sget v0, Lcom/facebook/debug/log/b;->b:I

    const/4 v1, 0x5

    if-gt v0, v1, :cond_0

    .line 429
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 430
    sget-object v1, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    if-eqz v1, :cond_1

    .line 431
    sget-object v1, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    invoke-interface {v1, p0, v0}, Lcom/facebook/debug/log/c;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 436
    :cond_0
    :goto_0
    return-void

    .line 433
    :cond_1
    invoke-static {p0, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public static b(I)Z
    .locals 1

    .prologue
    .line 54
    sget v0, Lcom/facebook/debug/log/b;->b:I

    if-lt p0, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static c(Ljava/lang/Class;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 302
    sget v0, Lcom/facebook/debug/log/b;->b:I

    const/4 v1, 0x4

    if-gt v0, v1, :cond_0

    .line 303
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    if-eqz v0, :cond_1

    .line 304
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    invoke-static {p0}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lcom/facebook/debug/log/c;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 309
    :cond_0
    :goto_0
    return-void

    .line 306
    :cond_1
    invoke-static {p0}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public static c(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/String;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    .prologue
    .line 376
    sget v0, Lcom/facebook/debug/log/b;->b:I

    const/4 v1, 0x4

    if-gt v0, v1, :cond_0

    .line 377
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    if-eqz v0, :cond_1

    .line 378
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    invoke-static {p0}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1, p2}, Lcom/facebook/debug/log/c;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 383
    :cond_0
    :goto_0
    return-void

    .line 380
    :cond_1
    invoke-static {p0}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public static varargs c(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .prologue
    .line 339
    sget v0, Lcom/facebook/debug/log/b;->b:I

    const/4 v1, 0x4

    if-gt v0, v1, :cond_0

    .line 340
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 341
    sget-object v1, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    if-eqz v1, :cond_1

    .line 342
    sget-object v1, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    invoke-static {p0}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Lcom/facebook/debug/log/c;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 347
    :cond_0
    :goto_0
    return-void

    .line 344
    :cond_1
    invoke-static {p0}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 285
    sget v0, Lcom/facebook/debug/log/b;->b:I

    const/4 v1, 0x4

    if-gt v0, v1, :cond_0

    .line 286
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    if-eqz v0, :cond_1

    .line 287
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    invoke-interface {v0, p0, p1}, Lcom/facebook/debug/log/c;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 292
    :cond_0
    :goto_0
    return-void

    .line 289
    :cond_1
    invoke-static {p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 466
    sget v0, Lcom/facebook/debug/log/b;->b:I

    const/4 v1, 0x5

    if-gt v0, v1, :cond_0

    .line 467
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    if-eqz v0, :cond_1

    .line 468
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    invoke-interface {v0, p0, p1, p2}, Lcom/facebook/debug/log/c;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 473
    :cond_0
    :goto_0
    return-void

    .line 470
    :cond_1
    invoke-static {p0, p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public static varargs c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 570
    sget v0, Lcom/facebook/debug/log/b;->b:I

    const/4 v1, 0x6

    if-gt v0, v1, :cond_0

    .line 571
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 572
    sget-object v1, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    if-eqz v1, :cond_1

    .line 573
    sget-object v1, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    invoke-interface {v1, p0, v0}, Lcom/facebook/debug/log/c;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 578
    :cond_0
    :goto_0
    return-void

    .line 575
    :cond_1
    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public static d(Ljava/lang/Class;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 410
    sget v0, Lcom/facebook/debug/log/b;->b:I

    const/4 v1, 0x5

    if-gt v0, v1, :cond_0

    .line 411
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    if-eqz v0, :cond_1

    .line 412
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    invoke-static {p0}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lcom/facebook/debug/log/c;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 417
    :cond_0
    :goto_0
    return-void

    .line 414
    :cond_1
    invoke-static {p0}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public static d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/String;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    .prologue
    .line 484
    sget v0, Lcom/facebook/debug/log/b;->b:I

    const/4 v1, 0x5

    if-gt v0, v1, :cond_0

    .line 485
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    if-eqz v0, :cond_1

    .line 486
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    invoke-static {p0}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1, p2}, Lcom/facebook/debug/log/c;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 491
    :cond_0
    :goto_0
    return-void

    .line 488
    :cond_1
    invoke-static {p0}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public static varargs d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .prologue
    .line 447
    sget v0, Lcom/facebook/debug/log/b;->b:I

    const/4 v1, 0x5

    if-gt v0, v1, :cond_0

    .line 448
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 449
    sget-object v1, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    if-eqz v1, :cond_1

    .line 450
    sget-object v1, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    invoke-static {p0}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Lcom/facebook/debug/log/c;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 455
    :cond_0
    :goto_0
    return-void

    .line 452
    :cond_1
    invoke-static {p0}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 393
    sget v0, Lcom/facebook/debug/log/b;->b:I

    const/4 v1, 0x5

    if-gt v0, v1, :cond_0

    .line 394
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    if-eqz v0, :cond_1

    .line 395
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    invoke-interface {v0, p0, p1}, Lcom/facebook/debug/log/c;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 400
    :cond_0
    :goto_0
    return-void

    .line 397
    :cond_1
    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 608
    sget v0, Lcom/facebook/debug/log/b;->b:I

    const/4 v1, 0x6

    if-gt v0, v1, :cond_0

    .line 609
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    if-eqz v0, :cond_1

    .line 610
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    invoke-interface {v0, p0, p1, p2}, Lcom/facebook/debug/log/c;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 615
    :cond_0
    :goto_0
    return-void

    .line 612
    :cond_1
    invoke-static {p0, p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public static e(Ljava/lang/Class;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 552
    sget v0, Lcom/facebook/debug/log/b;->b:I

    const/4 v1, 0x6

    if-gt v0, v1, :cond_0

    .line 553
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    if-eqz v0, :cond_1

    .line 554
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    invoke-static {p0}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lcom/facebook/debug/log/c;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 559
    :cond_0
    :goto_0
    return-void

    .line 556
    :cond_1
    invoke-static {p0}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public static e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/String;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    .prologue
    .line 626
    sget v0, Lcom/facebook/debug/log/b;->b:I

    const/4 v1, 0x6

    if-gt v0, v1, :cond_0

    .line 627
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    if-eqz v0, :cond_1

    .line 628
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    invoke-static {p0}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1, p2}, Lcom/facebook/debug/log/c;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 633
    :cond_0
    :goto_0
    return-void

    .line 630
    :cond_1
    invoke-static {p0}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public static varargs e(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .prologue
    .line 589
    sget v0, Lcom/facebook/debug/log/b;->b:I

    const/4 v1, 0x6

    if-gt v0, v1, :cond_0

    .line 590
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 591
    sget-object v1, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    if-eqz v1, :cond_1

    .line 592
    sget-object v1, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    invoke-static {p0}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Lcom/facebook/debug/log/c;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 597
    :cond_0
    :goto_0
    return-void

    .line 594
    :cond_1
    invoke-static {p0}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 535
    sget v0, Lcom/facebook/debug/log/b;->b:I

    const/4 v1, 0x6

    if-gt v0, v1, :cond_0

    .line 536
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    if-eqz v0, :cond_1

    .line 537
    sget-object v0, Lcom/facebook/debug/log/b;->a:Lcom/facebook/debug/log/c;

    invoke-interface {v0, p0, p1}, Lcom/facebook/debug/log/c;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 542
    :cond_0
    :goto_0
    return-void

    .line 539
    :cond_1
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method
