.class public final Lkik/android/chat/fragment/ViewPictureFragment$a;
.super Lkik/android/util/an;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/chat/fragment/ViewPictureFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 1166
    invoke-direct {p0}, Lkik/android/util/an;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lkik/android/chat/fragment/ViewPictureFragment$a;
    .locals 2

    .prologue
    .line 1203
    const-string v0, "VIEW_PICTURE_TYPE"

    const/4 v1, 0x3

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/ViewPictureFragment$a;->a(Ljava/lang/String;I)V

    .line 1204
    return-object p0
.end method

.method public final a(Lcom/kik/cards/web/kik/KikContentMessageParcelable;)Lkik/android/chat/fragment/ViewPictureFragment$a;
    .locals 1

    .prologue
    .line 1256
    const-string v0, "CONTENT_MESSAGE"

    invoke-virtual {p0, v0, p1}, Lkik/android/chat/fragment/ViewPictureFragment$a;->a(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1257
    return-object p0
.end method

.method public final a(Ljava/lang/String;)Lkik/android/chat/fragment/ViewPictureFragment$a;
    .locals 1

    .prologue
    .line 1170
    const-string v0, "JID"

    invoke-virtual {p0, v0, p1}, Lkik/android/chat/fragment/ViewPictureFragment$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1171
    return-object p0
.end method

.method public final a([B)Lkik/android/chat/fragment/ViewPictureFragment$a;
    .locals 1

    .prologue
    .line 1245
    const-string v0, "MESSAGING_KEY"

    invoke-virtual {p0, v0, p1}, Lkik/android/chat/fragment/ViewPictureFragment$a;->a(Ljava/lang/String;[B)V

    .line 1246
    return-object p0
.end method

.method public final b()Lkik/android/chat/fragment/ViewPictureFragment$a;
    .locals 2

    .prologue
    .line 1209
    const-string v0, "VIEW_PICTURE_TYPE"

    const/4 v1, 0x7

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/ViewPictureFragment$a;->a(Ljava/lang/String;I)V

    .line 1210
    return-object p0
.end method

.method public final b(Ljava/lang/String;)Lkik/android/chat/fragment/ViewPictureFragment$a;
    .locals 1

    .prologue
    .line 1181
    const-string v0, "PREVIEW"

    invoke-virtual {p0, v0, p1}, Lkik/android/chat/fragment/ViewPictureFragment$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1182
    return-object p0
.end method

.method public final c()Lkik/android/chat/fragment/ViewPictureFragment$a;
    .locals 2

    .prologue
    .line 1221
    const-string v0, "VIEW_PICTURE_TYPE"

    const/4 v1, 0x4

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/ViewPictureFragment$a;->a(Ljava/lang/String;I)V

    .line 1222
    return-object p0
.end method

.method public final c(Ljava/lang/String;)Lkik/android/chat/fragment/ViewPictureFragment$a;
    .locals 1

    .prologue
    .line 1192
    const-string v0, "PHOTOURL"

    invoke-virtual {p0, v0, p1}, Lkik/android/chat/fragment/ViewPictureFragment$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1193
    return-object p0
.end method

.method public final d()Lkik/android/chat/fragment/ViewPictureFragment$a;
    .locals 2

    .prologue
    .line 1227
    const-string v0, "VIEW_PICTURE_TYPE"

    const/4 v1, 0x2

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/ViewPictureFragment$a;->a(Ljava/lang/String;I)V

    .line 1228
    return-object p0
.end method

.method public final e()Lkik/android/chat/fragment/ViewPictureFragment$a;
    .locals 2

    .prologue
    .line 1233
    const-string v0, "VIEW_PICTURE_TYPE"

    const/4 v1, 0x5

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/ViewPictureFragment$a;->a(Ljava/lang/String;I)V

    .line 1234
    const-string v0, "ALLOW_TO_ATTACH_MESSAGE"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/ViewPictureFragment$a;->a(Ljava/lang/String;Z)V

    .line 1235
    return-object p0
.end method
