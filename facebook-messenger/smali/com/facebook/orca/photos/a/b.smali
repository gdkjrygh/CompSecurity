.class public Lcom/facebook/orca/photos/a/b;
.super Ljava/lang/Object;
.source "DefaultThreadTiles.java"


# static fields
.field public static a:Lcom/facebook/widget/tiles/a;

.field public static b:Lcom/facebook/widget/tiles/a;


# instance fields
.field private final c:Lcom/facebook/widget/tiles/b;

.field private final d:Lcom/facebook/user/tiles/a;

.field private final e:Lcom/facebook/orca/threads/q;

.field private final f:Lcom/facebook/orca/f/z;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 22
    new-instance v0, Lcom/facebook/widget/tiles/a;

    const-string v1, "group"

    sget v2, Lcom/facebook/h;->orca_default_group_tile:I

    sget v3, Lcom/facebook/user/tiles/a;->a:I

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/widget/tiles/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/orca/photos/a/b;->a:Lcom/facebook/widget/tiles/a;

    .line 26
    new-instance v0, Lcom/facebook/widget/tiles/a;

    const-string v1, "mms"

    sget v2, Lcom/facebook/h;->orca_default_mms_tile:I

    sget v3, Lcom/facebook/user/tiles/a;->a:I

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/widget/tiles/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/orca/photos/a/b;->b:Lcom/facebook/widget/tiles/a;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/widget/tiles/b;Lcom/facebook/user/tiles/a;Lcom/facebook/orca/threads/q;Lcom/facebook/orca/f/z;)V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/facebook/orca/photos/a/b;->c:Lcom/facebook/widget/tiles/b;

    .line 42
    iput-object p2, p0, Lcom/facebook/orca/photos/a/b;->d:Lcom/facebook/user/tiles/a;

    .line 43
    iput-object p3, p0, Lcom/facebook/orca/photos/a/b;->e:Lcom/facebook/orca/threads/q;

    .line 44
    iput-object p4, p0, Lcom/facebook/orca/photos/a/b;->f:Lcom/facebook/orca/f/z;

    .line 45
    return-void
.end method

.method private a(Lcom/facebook/messages/model/threads/ParticipantInfo;)Lcom/facebook/widget/tiles/a;
    .locals 1

    .prologue
    .line 62
    if-eqz p1, :cond_2

    .line 63
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 64
    sget-object v0, Lcom/facebook/user/tiles/a;->b:Lcom/facebook/widget/tiles/a;

    .line 72
    :goto_0
    return-object v0

    .line 65
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 66
    sget-object v0, Lcom/facebook/user/tiles/a;->d:Lcom/facebook/widget/tiles/a;

    goto :goto_0

    .line 67
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 68
    sget-object v0, Lcom/facebook/user/tiles/a;->c:Lcom/facebook/widget/tiles/a;

    goto :goto_0

    .line 72
    :cond_2
    sget-object v0, Lcom/facebook/user/tiles/a;->b:Lcom/facebook/widget/tiles/a;

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Lcom/facebook/widget/tiles/a;
    .locals 2

    .prologue
    .line 145
    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 146
    invoke-static {p1}, Lcom/facebook/orca/threadview/dm;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/facebook/user/tiles/a;->d:Lcom/facebook/widget/tiles/a;

    .line 160
    :goto_0
    return-object v0

    .line 146
    :cond_0
    sget-object v0, Lcom/facebook/user/tiles/a;->b:Lcom/facebook/widget/tiles/a;

    goto :goto_0

    .line 148
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 149
    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->e()Lcom/facebook/user/RecipientInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/RecipientInfo;->a()Lcom/facebook/user/UserIdentifier;

    .line 150
    sget-object v0, Lcom/facebook/orca/photos/a/c;->a:[I

    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->e()Lcom/facebook/user/RecipientInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/user/RecipientInfo;->a()Lcom/facebook/user/UserIdentifier;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/user/UserIdentifier;->e()Lcom/facebook/user/s;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/user/s;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 160
    :cond_2
    sget-object v0, Lcom/facebook/user/tiles/a;->b:Lcom/facebook/widget/tiles/a;

    goto :goto_0

    .line 152
    :pswitch_0
    sget-object v0, Lcom/facebook/user/tiles/a;->b:Lcom/facebook/widget/tiles/a;

    goto :goto_0

    .line 154
    :pswitch_1
    sget-object v0, Lcom/facebook/user/tiles/a;->d:Lcom/facebook/widget/tiles/a;

    goto :goto_0

    .line 156
    :pswitch_2
    sget-object v0, Lcom/facebook/user/tiles/a;->c:Lcom/facebook/widget/tiles/a;

    goto :goto_0

    .line 150
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public a(Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/widget/tiles/a;
    .locals 3

    .prologue
    .line 132
    iget-object v0, p0, Lcom/facebook/orca/photos/a/b;->e:Lcom/facebook/orca/threads/q;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/threads/q;->a(Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threads/ThreadParticipant;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadParticipant;->a()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    .line 136
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->h()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/orca/photos/a/b;->f:Lcom/facebook/orca/f/z;

    invoke-virtual {v1, p1}, Lcom/facebook/orca/f/z;->c(Lcom/facebook/orca/threads/ThreadSummary;)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 138
    sget-object v0, Lcom/facebook/user/tiles/a;->b:Lcom/facebook/widget/tiles/a;

    .line 140
    :goto_0
    return-object v0

    :cond_0
    invoke-direct {p0, v0}, Lcom/facebook/orca/photos/a/b;->a(Lcom/facebook/messages/model/threads/ParticipantInfo;)Lcom/facebook/widget/tiles/a;

    move-result-object v0

    goto :goto_0
.end method
