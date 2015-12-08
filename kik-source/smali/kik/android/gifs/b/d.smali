.class public final Lkik/android/gifs/b/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/gifs/b/d$1;
    }
.end annotation


# direct methods
.method public static a(Ljava/lang/String;Lcom/kik/l/ab;Lkik/android/gifs/a/f$a;I)Lkik/android/gifs/b/c;
    .locals 3

    .prologue
    .line 19
    sget-object v0, Lkik/android/gifs/b/d$1;->a:[I

    invoke-virtual {p2}, Lkik/android/gifs/a/f$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 28
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unsupported decoding type "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Lkik/android/gifs/a/f$a;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 23
    :pswitch_0
    new-instance v0, Lkik/android/gifs/b/g;

    invoke-direct {v0, p0, p3, p1}, Lkik/android/gifs/b/g;-><init>(Ljava/lang/String;ILcom/kik/l/ab;)V

    return-object v0

    .line 19
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
