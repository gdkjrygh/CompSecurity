.class public final Lcom/a/c/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Z

.field private static b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20
    const/4 v0, 0x0

    sput-boolean v0, Lcom/a/c/d;->a:Z

    .line 21
    const/4 v0, 0x1

    sput-boolean v0, Lcom/a/c/d;->b:Z

    return-void
.end method

.method public static a(I)I
    .locals 1

    .prologue
    const/4 v0, 0x2

    .line 62
    packed-switch p0, :pswitch_data_0

    .line 70
    :goto_0
    :pswitch_0
    return v0

    .line 66
    :pswitch_1
    const/4 v0, 0x1

    goto :goto_0

    .line 68
    :pswitch_2
    const/4 v0, 0x4

    goto :goto_0

    .line 62
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 23
    sget-boolean v0, Lcom/a/c/d;->b:Z

    if-eqz v0, :cond_0

    .line 24
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    :cond_0
    return-void
.end method

.method public static a()Z
    .locals 4

    .prologue
    const/16 v3, 0x10

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 35
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v2, v3, :cond_2

    .line 1040
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v2, v3, :cond_1

    .line 1041
    const-string v2, "SM-G900H"

    invoke-static {v2}, Lcom/a/c/d;->a(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 1042
    const-string v2, "MI 3W"

    invoke-static {v2}, Lcom/a/c/d;->a(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 1043
    const-string v2, "HTC One"

    invoke-static {v2}, Lcom/a/c/d;->a(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 1044
    const-string v2, "H30-U10"

    invoke-static {v2}, Lcom/a/c/d;->a(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 1045
    const-string v2, "SD4930UR"

    invoke-static {v2}, Lcom/a/c/d;->a(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 1046
    const-string v2, "Nexus 5"

    invoke-static {v2}, Lcom/a/c/d;->a(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 1047
    const-string v2, "SM-N900"

    invoke-static {v2}, Lcom/a/c/d;->a(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 1048
    const-string v2, "GT-I9300"

    invoke-static {v2}, Lcom/a/c/d;->a(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 1049
    const-string v2, "MI 2S"

    invoke-static {v2}, Lcom/a/c/d;->a(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 1050
    const-string v2, "Nexus 10"

    invoke-static {v2}, Lcom/a/c/d;->a(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 1051
    const-string v2, "White list, ^_^"

    invoke-static {v2}, Lcom/a/c/d;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    move v2, v0

    .line 36
    :goto_0
    if-eqz v2, :cond_2

    .line 35
    :goto_1
    return v0

    :cond_1
    move v2, v1

    .line 1040
    goto :goto_0

    :cond_2
    move v0, v1

    .line 35
    goto :goto_1
.end method

.method private static a(Ljava/lang/String;)Z
    .locals 2

    .prologue
    .line 54
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 55
    sget-object v1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 56
    invoke-virtual {v0, p0}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    .line 57
    invoke-virtual {v1, p0}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    .line 56
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public static b(I)I
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 81
    .line 82
    packed-switch p0, :pswitch_data_0

    :pswitch_0
    move v0, v1

    .line 94
    :goto_0
    :pswitch_1
    return v0

    .line 1076
    :pswitch_2
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x10

    if-lt v2, v3, :cond_0

    .line 1077
    const-string v2, "HUAWEI U9508"

    invoke-static {v2}, Lcom/a/c/d;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 87
    :goto_1
    if-eqz v0, :cond_1

    .line 88
    const/4 v0, 0x2

    goto :goto_0

    :cond_0
    move v0, v1

    .line 1076
    goto :goto_1

    .line 90
    :cond_1
    const/4 v0, 0x3

    goto :goto_0

    .line 82
    nop

    :pswitch_data_0
    .packed-switch 0x13
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public static b()[I
    .locals 1

    .prologue
    .line 98
    invoke-static {}, Lcom/a/c/b;->a()[I

    move-result-object v0

    return-object v0
.end method
