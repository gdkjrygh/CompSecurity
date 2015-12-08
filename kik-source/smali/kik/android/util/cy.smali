.class public final Lkik/android/util/cy;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 17
    packed-switch p0, :pswitch_data_0

    .line 29
    const v0, 0x7f0900ae

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    .line 19
    :pswitch_0
    const v0, 0x7f0900af

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 17
    nop

    :pswitch_data_0
    .packed-switch 0x65
        :pswitch_0
    .end packed-switch
.end method

.method public static a(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 35
    const/16 v0, 0x67

    invoke-static {v0}, Lkik/android/util/cy;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 37
    instance-of v1, p0, Lkik/a/f/q;

    if-eqz v1, :cond_0

    .line 38
    check-cast p0, Lkik/a/f/q;

    .line 39
    invoke-virtual {p0}, Lkik/a/f/q;->a()I

    move-result v0

    .line 41
    packed-switch v0, :pswitch_data_0

    .line 46
    invoke-static {v0}, Lkik/android/util/cy;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 51
    :cond_0
    :goto_0
    return-object v0

    .line 43
    :pswitch_0
    invoke-virtual {p0}, Lkik/a/f/q;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    .line 41
    nop

    :pswitch_data_0
    .packed-switch 0x68
        :pswitch_0
    .end packed-switch
.end method
