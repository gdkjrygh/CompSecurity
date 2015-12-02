.class public Lcom/facebook/orca/emoji/q;
.super Ljava/lang/Object;
.source "EmojiAttachmentPrefKeys.java"


# static fields
.field public static final a:Lcom/facebook/prefs/shared/ae;

.field public static final b:Lcom/facebook/prefs/shared/ae;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 11
    sget-object v0, Lcom/facebook/prefs/shared/aj;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "emoji_attachment/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/emoji/q;->a:Lcom/facebook/prefs/shared/ae;

    .line 12
    sget-object v0, Lcom/facebook/orca/emoji/q;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "front_state/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/emoji/q;->b:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;
    .locals 1

    .prologue
    .line 15
    sget-object v0, Lcom/facebook/orca/emoji/q;->b:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v0, p0}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    return-object v0
.end method
