.class public final Lcom/roidapp/baselib/c/an;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field protected static a:Landroid/widget/Toast;

.field protected static b:Landroid/widget/Toast;

.field protected static c:Landroid/widget/Toast;

.field private static d:Ljava/lang/String;

.field private static e:J

.field private static f:J


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    const/4 v0, 0x0

    .line 15
    sput-object v0, Lcom/roidapp/baselib/c/an;->a:Landroid/widget/Toast;

    .line 16
    sput-object v0, Lcom/roidapp/baselib/c/an;->b:Landroid/widget/Toast;

    .line 17
    sput-object v0, Lcom/roidapp/baselib/c/an;->c:Landroid/widget/Toast;

    .line 18
    sput-wide v2, Lcom/roidapp/baselib/c/an;->e:J

    .line 19
    sput-wide v2, Lcom/roidapp/baselib/c/an;->f:J

    return-void
.end method

.method public static a(Landroid/content/Context;I)V
    .locals 2

    .prologue
    .line 27
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 28
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 29
    :cond_0
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 22
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, p1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 23
    return-void
.end method

.method public static a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/content/Context;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 32
    sget-object v0, Lcom/roidapp/baselib/c/an;->a:Landroid/widget/Toast;

    if-nez v0, :cond_1

    .line 33
    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    .line 34
    if-eqz v0, :cond_0

    .line 36
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 37
    sput-object v0, Lcom/roidapp/baselib/c/an;->a:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 38
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lcom/roidapp/baselib/c/an;->e:J
    :try_end_0
    .catch Landroid/view/InflateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 57
    :cond_0
    :goto_0
    sget-wide v0, Lcom/roidapp/baselib/c/an;->f:J

    sput-wide v0, Lcom/roidapp/baselib/c/an;->e:J

    .line 58
    return-void

    .line 40
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Landroid/view/InflateException;->printStackTrace()V

    goto :goto_0

    .line 42
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    .line 46
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lcom/roidapp/baselib/c/an;->f:J

    .line 47
    sget-object v0, Lcom/roidapp/baselib/c/an;->d:Ljava/lang/String;

    if-ne p1, v0, :cond_2

    .line 48
    sget-wide v0, Lcom/roidapp/baselib/c/an;->f:J

    sget-wide v2, Lcom/roidapp/baselib/c/an;->e:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 49
    sget-object v0, Lcom/roidapp/baselib/c/an;->a:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 52
    :cond_2
    sput-object p1, Lcom/roidapp/baselib/c/an;->d:Ljava/lang/String;

    .line 53
    sget-object v0, Lcom/roidapp/baselib/c/an;->a:Landroid/widget/Toast;

    invoke-virtual {v0, p1}, Landroid/widget/Toast;->setText(Ljava/lang/CharSequence;)V

    .line 54
    sget-object v0, Lcom/roidapp/baselib/c/an;->a:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method

.method public static b(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/content/Context;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    const/16 v5, 0x11

    const/4 v4, 0x0

    .line 65
    sget-object v0, Lcom/roidapp/baselib/c/an;->c:Landroid/widget/Toast;

    if-nez v0, :cond_1

    .line 66
    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    .line 67
    if-eqz v0, :cond_0

    .line 69
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 70
    sput-object v0, Lcom/roidapp/baselib/c/an;->c:Landroid/widget/Toast;

    const/16 v1, 0x11

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/Toast;->setGravity(III)V

    .line 71
    sget-object v0, Lcom/roidapp/baselib/c/an;->c:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 72
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lcom/roidapp/baselib/c/an;->e:J
    :try_end_0
    .catch Landroid/view/InflateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    :cond_0
    :goto_0
    sget-wide v0, Lcom/roidapp/baselib/c/an;->f:J

    sput-wide v0, Lcom/roidapp/baselib/c/an;->e:J

    .line 92
    return-void

    .line 74
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Landroid/view/InflateException;->printStackTrace()V

    goto :goto_0

    .line 78
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lcom/roidapp/baselib/c/an;->f:J

    .line 79
    sget-object v0, Lcom/roidapp/baselib/c/an;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 80
    sget-wide v0, Lcom/roidapp/baselib/c/an;->f:J

    sget-wide v2, Lcom/roidapp/baselib/c/an;->e:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 81
    sget-object v0, Lcom/roidapp/baselib/c/an;->c:Landroid/widget/Toast;

    invoke-virtual {v0, v5, v4, v4}, Landroid/widget/Toast;->setGravity(III)V

    .line 82
    sget-object v0, Lcom/roidapp/baselib/c/an;->c:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 85
    :cond_2
    sput-object p1, Lcom/roidapp/baselib/c/an;->d:Ljava/lang/String;

    .line 86
    sget-object v0, Lcom/roidapp/baselib/c/an;->c:Landroid/widget/Toast;

    invoke-virtual {v0, p1}, Landroid/widget/Toast;->setText(Ljava/lang/CharSequence;)V

    .line 87
    sget-object v0, Lcom/roidapp/baselib/c/an;->c:Landroid/widget/Toast;

    invoke-virtual {v0, v5, v4, v4}, Landroid/widget/Toast;->setGravity(III)V

    .line 88
    sget-object v0, Lcom/roidapp/baselib/c/an;->c:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method

.method public static c(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/content/Context;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 105
    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    .line 106
    if-nez v0, :cond_0

    .line 142
    :goto_0
    return-void

    .line 110
    :cond_0
    sget-object v1, Lcom/roidapp/baselib/c/an;->b:Landroid/widget/Toast;

    if-nez v1, :cond_2

    .line 111
    new-instance v1, Ljava/lang/ref/WeakReference;

    new-instance v2, Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/widget/Toast;-><init>(Landroid/content/Context;)V

    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 112
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/Toast;

    .line 113
    sput-object v1, Lcom/roidapp/baselib/c/an;->b:Landroid/widget/Toast;

    if-eqz v1, :cond_1

    .line 114
    new-instance v1, Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 115
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 116
    const/16 v0, 0x11

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 117
    const v0, 0x1080096

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 118
    sget-object v0, Lcom/roidapp/baselib/c/an;->b:Landroid/widget/Toast;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/Toast;->setDuration(I)V

    .line 120
    sget-object v0, Lcom/roidapp/baselib/c/an;->b:Landroid/widget/Toast;

    invoke-virtual {v0, v1}, Landroid/widget/Toast;->setView(Landroid/view/View;)V

    .line 121
    sget-object v0, Lcom/roidapp/baselib/c/an;->b:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 122
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lcom/roidapp/baselib/c/an;->e:J

    .line 141
    :cond_1
    :goto_1
    sget-wide v0, Lcom/roidapp/baselib/c/an;->f:J

    sput-wide v0, Lcom/roidapp/baselib/c/an;->e:J

    goto :goto_0

    .line 125
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lcom/roidapp/baselib/c/an;->f:J

    .line 126
    sget-object v0, Lcom/roidapp/baselib/c/an;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 127
    sget-wide v0, Lcom/roidapp/baselib/c/an;->f:J

    sget-wide v2, Lcom/roidapp/baselib/c/an;->e:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 128
    sget-object v0, Lcom/roidapp/baselib/c/an;->b:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->getView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 129
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 130
    sget-object v1, Lcom/roidapp/baselib/c/an;->b:Landroid/widget/Toast;

    invoke-virtual {v1, v0}, Landroid/widget/Toast;->setView(Landroid/view/View;)V

    .line 131
    sget-object v0, Lcom/roidapp/baselib/c/an;->b:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_1

    .line 134
    :cond_3
    sput-object p1, Lcom/roidapp/baselib/c/an;->d:Ljava/lang/String;

    .line 135
    sget-object v0, Lcom/roidapp/baselib/c/an;->b:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->getView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 136
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 137
    sget-object v1, Lcom/roidapp/baselib/c/an;->b:Landroid/widget/Toast;

    invoke-virtual {v1, v0}, Landroid/widget/Toast;->setView(Landroid/view/View;)V

    .line 138
    sget-object v0, Lcom/roidapp/baselib/c/an;->b:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_1
.end method
