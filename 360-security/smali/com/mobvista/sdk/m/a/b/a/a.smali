.class public final Lcom/mobvista/sdk/m/a/b/a/a;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field public static a:Ljava/util/HashSet;

.field private static b:Z

.field private static c:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 39
    const/4 v0, 0x0

    sput-object v0, Lcom/mobvista/sdk/m/a/b/a/a;->a:Ljava/util/HashSet;

    .line 41
    const/4 v0, 0x0

    sput-boolean v0, Lcom/mobvista/sdk/m/a/b/a/a;->b:Z

    .line 43
    const-wide/16 v0, 0x0

    sput-wide v0, Lcom/mobvista/sdk/m/a/b/a/a;->c:J

    return-void
.end method

.method public static a(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 139
    invoke-static {p1}, Lcom/mobvista/sdk/m/a/f/j;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2}, Lcom/mobvista/sdk/m/a/f/j;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 144
    sget-boolean v0, Lcom/mobvista/sdk/m/a/b/a/a;->b:Z

    if-eqz v0, :cond_1

    sget-object v0, Lcom/mobvista/sdk/m/a/b/a/a;->a:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 150
    :cond_0
    :goto_0
    return-void

    .line 148
    :cond_1
    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lcom/mobvista/sdk/m/a/b/a/a;->b(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private static a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 153
    invoke-static {p1}, Lcom/mobvista/sdk/m/a/f/j;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2}, Lcom/mobvista/sdk/m/a/f/j;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p3, :cond_0

    .line 158
    sget-boolean v0, Lcom/mobvista/sdk/m/a/b/a/a;->b:Z

    if-eqz v0, :cond_1

    sget-object v0, Lcom/mobvista/sdk/m/a/b/a/a;->a:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 165
    :cond_0
    :goto_0
    return-void

    .line 162
    :cond_1
    const/4 v0, 0x5

    invoke-static {v0, p1, p2, p3}, Lcom/mobvista/sdk/m/a/b/a/a;->b(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 91
    const/4 v0, 0x1

    const-string/jumbo v1, "Logger"

    invoke-static {v0, v1, p0}, Lcom/mobvista/sdk/m/a/b/a/a;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 92
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 95
    const/4 v0, 0x1

    invoke-static {v0, p0, p1}, Lcom/mobvista/sdk/m/a/b/a/a;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 96
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 127
    const/4 v0, 0x5

    invoke-static {v0, p0, p1, p2}, Lcom/mobvista/sdk/m/a/b/a/a;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 128
    return-void
.end method

.method private static b(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 169
    if-nez p3, :cond_0

    .line 170
    packed-switch p0, :pswitch_data_0

    .line 211
    :goto_0
    return-void

    .line 172
    :pswitch_0
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 175
    :pswitch_1
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 178
    :pswitch_2
    invoke-static {p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 181
    :pswitch_3
    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 184
    :pswitch_4
    invoke-static {p1, p2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 188
    :cond_0
    packed-switch p0, :pswitch_data_1

    goto :goto_0

    .line 202
    :pswitch_5
    invoke-static {p1, p2, p3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 190
    :pswitch_6
    invoke-static {p1, p2, p3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 193
    :pswitch_7
    invoke-static {p1, p2, p3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 196
    :pswitch_8
    invoke-static {p1, p2, p3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 199
    :pswitch_9
    invoke-static {p1, p2, p3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 170
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 188
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_5
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 111
    const/4 v0, 0x2

    invoke-static {v0, p0, p1}, Lcom/mobvista/sdk/m/a/b/a/a;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 112
    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 119
    const/4 v0, 0x4

    invoke-static {v0, p0, p1}, Lcom/mobvista/sdk/m/a/b/a/a;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 120
    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 123
    const/4 v0, 0x5

    invoke-static {v0, p0, p1}, Lcom/mobvista/sdk/m/a/b/a/a;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 124
    return-void
.end method
