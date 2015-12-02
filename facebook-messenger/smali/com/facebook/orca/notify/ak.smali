.class public Lcom/facebook/orca/notify/ak;
.super Ljava/lang/Object;
.source "MessagingNotificationFeedback.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final b:[J

.field private static final c:[J


# instance fields
.field private final d:Landroid/content/Context;

.field private final e:Landroid/os/Vibrator;

.field private final f:Landroid/media/AudioManager;

.field private final g:Lcom/facebook/orca/notify/an;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 22
    const-class v0, Lcom/facebook/orca/notify/ak;

    sput-object v0, Lcom/facebook/orca/notify/ak;->a:Ljava/lang/Class;

    .line 24
    const/4 v0, 0x2

    new-array v0, v0, [J

    fill-array-data v0, :array_0

    sput-object v0, Lcom/facebook/orca/notify/ak;->b:[J

    .line 28
    const/4 v0, 0x4

    new-array v0, v0, [J

    fill-array-data v0, :array_1

    sput-object v0, Lcom/facebook/orca/notify/ak;->c:[J

    return-void

    .line 24
    nop

    :array_0
    .array-data 8
        0x0
        0x64
    .end array-data

    .line 28
    :array_1
    .array-data 8
        0x0
        0xfa
        0xc8
        0xfa
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Vibrator;Landroid/media/AudioManager;Lcom/facebook/orca/notify/an;)V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lcom/facebook/orca/notify/ak;->d:Landroid/content/Context;

    .line 44
    iput-object p2, p0, Lcom/facebook/orca/notify/ak;->e:Landroid/os/Vibrator;

    .line 45
    iput-object p3, p0, Lcom/facebook/orca/notify/ak;->f:Landroid/media/AudioManager;

    .line 46
    iput-object p4, p0, Lcom/facebook/orca/notify/ak;->g:Lcom/facebook/orca/notify/an;

    .line 47
    return-void
.end method

.method private a(Z)V
    .locals 3

    .prologue
    const/4 v2, -0x1

    .line 101
    iget-object v0, p0, Lcom/facebook/orca/notify/ak;->g:Lcom/facebook/orca/notify/an;

    invoke-interface {v0}, Lcom/facebook/orca/notify/an;->a()Z

    move-result v0

    .line 103
    if-eqz v0, :cond_0

    .line 104
    if-nez p1, :cond_1

    .line 105
    sget-object v0, Lcom/facebook/orca/notify/ak;->a:Ljava/lang/Class;

    const-string v1, "Vibrating short"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 106
    iget-object v0, p0, Lcom/facebook/orca/notify/ak;->e:Landroid/os/Vibrator;

    sget-object v1, Lcom/facebook/orca/notify/ak;->b:[J

    invoke-virtual {v0, v1, v2}, Landroid/os/Vibrator;->vibrate([JI)V

    .line 112
    :cond_0
    :goto_0
    return-void

    .line 108
    :cond_1
    sget-object v0, Lcom/facebook/orca/notify/ak;->a:Ljava/lang/Class;

    const-string v1, "Vibrating normal"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 109
    iget-object v0, p0, Lcom/facebook/orca/notify/ak;->e:Landroid/os/Vibrator;

    sget-object v1, Lcom/facebook/orca/notify/ak;->c:[J

    invoke-virtual {v0, v1, v2}, Landroid/os/Vibrator;->vibrate([JI)V

    goto :goto_0
.end method

.method private a()Z
    .locals 2

    .prologue
    .line 87
    iget-object v0, p0, Lcom/facebook/orca/notify/ak;->f:Landroid/media/AudioManager;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private b()V
    .locals 3

    .prologue
    .line 117
    :try_start_0
    invoke-direct {p0}, Lcom/facebook/orca/notify/ak;->c()Landroid/net/Uri;

    move-result-object v1

    .line 118
    if-eqz v1, :cond_0

    .line 119
    new-instance v0, Landroid/media/MediaPlayer;

    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    .line 120
    iget-object v2, p0, Lcom/facebook/orca/notify/ak;->d:Landroid/content/Context;

    invoke-virtual {v0, v2, v1}, Landroid/media/MediaPlayer;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    .line 126
    :goto_0
    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setAudioStreamType(I)V

    .line 127
    new-instance v1, Lcom/facebook/orca/notify/al;

    invoke-direct {v1, p0}, Lcom/facebook/orca/notify/al;-><init>(Lcom/facebook/orca/notify/ak;)V

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 133
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepare()V

    .line 134
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 138
    :goto_1
    return-void

    .line 122
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/notify/ak;->d:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroid/media/MediaPlayer;->create(Landroid/content/Context;I)Landroid/media/MediaPlayer;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 135
    :catch_0
    move-exception v0

    .line 136
    sget-object v1, Lcom/facebook/orca/notify/ak;->a:Ljava/lang/Class;

    const-string v2, "MediaPlayer create failed: "

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method private c()Landroid/net/Uri;
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 147
    iget-object v0, p0, Lcom/facebook/orca/notify/ak;->g:Lcom/facebook/orca/notify/an;

    invoke-interface {v0}, Lcom/facebook/orca/notify/an;->d()Landroid/net/Uri;

    move-result-object v0

    .line 148
    if-nez v0, :cond_1

    .line 182
    :cond_0
    :goto_0
    return-object v1

    .line 154
    :cond_1
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    .line 155
    if-eqz v2, :cond_2

    const-string v3, "file"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 156
    :cond_2
    new-instance v2, Ljava/io/File;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 157
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_3

    :goto_1
    move-object v1, v0

    goto :goto_0

    :cond_3
    move-object v0, v1

    goto :goto_1

    .line 161
    :cond_4
    const/4 v2, 0x0

    .line 163
    :try_start_0
    iget-object v3, p0, Lcom/facebook/orca/notify/ak;->d:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    .line 164
    const-string v4, "r"

    invoke-virtual {v3, v0, v4}, Landroid/content/ContentResolver;->openAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    .line 165
    if-nez v2, :cond_5

    .line 177
    if-eqz v2, :cond_0

    .line 179
    :try_start_1
    invoke-virtual {v2}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 180
    :catch_0
    move-exception v0

    goto :goto_0

    .line 177
    :cond_5
    if-eqz v2, :cond_6

    .line 179
    :try_start_2
    invoke-virtual {v2}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_7

    :cond_6
    :goto_2
    move-object v1, v0

    .line 182
    goto :goto_0

    .line 169
    :catch_1
    move-exception v0

    .line 177
    if-eqz v1, :cond_0

    .line 179
    :try_start_3
    invoke-virtual {v2}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_0

    .line 180
    :catch_2
    move-exception v0

    goto :goto_0

    .line 171
    :catch_3
    move-exception v0

    .line 177
    if-eqz v1, :cond_0

    .line 179
    :try_start_4
    invoke-virtual {v2}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_0

    .line 180
    :catch_4
    move-exception v0

    goto :goto_0

    .line 173
    :catch_5
    move-exception v0

    .line 177
    if-eqz v1, :cond_0

    .line 179
    :try_start_5
    invoke-virtual {v2}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_6

    goto :goto_0

    .line 180
    :catch_6
    move-exception v0

    goto :goto_0

    .line 177
    :catchall_0
    move-exception v0

    if-eqz v1, :cond_7

    .line 179
    :try_start_6
    invoke-virtual {v2}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_8

    .line 182
    :cond_7
    :goto_3
    throw v0

    .line 180
    :catch_7
    move-exception v1

    goto :goto_2

    :catch_8
    move-exception v1

    goto :goto_3
.end method


# virtual methods
.method public a(Landroid/app/Notification;Lcom/facebook/orca/notify/c;)V
    .locals 3

    .prologue
    .line 52
    iget-object v0, p0, Lcom/facebook/orca/notify/ak;->g:Lcom/facebook/orca/notify/an;

    invoke-interface {v0}, Lcom/facebook/orca/notify/an;->b()Z

    move-result v0

    .line 53
    iget-object v1, p0, Lcom/facebook/orca/notify/ak;->g:Lcom/facebook/orca/notify/an;

    invoke-interface {v1}, Lcom/facebook/orca/notify/an;->a()Z

    move-result v1

    .line 54
    iget-object v2, p0, Lcom/facebook/orca/notify/ak;->g:Lcom/facebook/orca/notify/an;

    invoke-interface {v2}, Lcom/facebook/orca/notify/an;->c()Z

    move-result v2

    .line 56
    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/facebook/orca/notify/c;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 57
    invoke-direct {p0}, Lcom/facebook/orca/notify/ak;->c()Landroid/net/Uri;

    move-result-object v0

    .line 58
    if-eqz v0, :cond_3

    .line 59
    iput-object v0, p1, Landroid/app/Notification;->sound:Landroid/net/Uri;

    .line 63
    :goto_0
    invoke-virtual {p2}, Lcom/facebook/orca/notify/c;->c()V

    .line 65
    :cond_0
    if-eqz v1, :cond_1

    invoke-virtual {p2}, Lcom/facebook/orca/notify/c;->d()Z

    move-result v0

    if-nez v0, :cond_1

    .line 66
    const/4 v0, 0x4

    new-array v0, v0, [J

    fill-array-data v0, :array_0

    iput-object v0, p1, Landroid/app/Notification;->vibrate:[J

    .line 67
    invoke-virtual {p2}, Lcom/facebook/orca/notify/c;->e()V

    .line 69
    :cond_1
    if-eqz v2, :cond_2

    invoke-virtual {p2}, Lcom/facebook/orca/notify/c;->l()Z

    move-result v0

    if-nez v0, :cond_2

    .line 70
    const v0, -0xff0100

    iput v0, p1, Landroid/app/Notification;->ledARGB:I

    .line 71
    const/16 v0, 0x12c

    iput v0, p1, Landroid/app/Notification;->ledOnMS:I

    .line 72
    const/16 v0, 0x3e8

    iput v0, p1, Landroid/app/Notification;->ledOffMS:I

    .line 73
    iget v0, p1, Landroid/app/Notification;->flags:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p1, Landroid/app/Notification;->flags:I

    .line 74
    invoke-virtual {p2}, Lcom/facebook/orca/notify/c;->m()V

    .line 76
    :cond_2
    return-void

    .line 61
    :cond_3
    iget v0, p1, Landroid/app/Notification;->defaults:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p1, Landroid/app/Notification;->defaults:I

    goto :goto_0

    .line 66
    :array_0
    .array-data 8
        0x0
        0xc8
        0xc8
        0xc8
    .end array-data
.end method

.method public a(Lcom/facebook/orca/notify/c;)V
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lcom/facebook/orca/notify/ak;->g:Lcom/facebook/orca/notify/an;

    invoke-interface {v0}, Lcom/facebook/orca/notify/an;->b()Z

    move-result v0

    .line 80
    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/facebook/orca/notify/ak;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 81
    invoke-direct {p0}, Lcom/facebook/orca/notify/ak;->b()V

    .line 82
    invoke-virtual {p1}, Lcom/facebook/orca/notify/c;->c()V

    .line 84
    :cond_0
    return-void
.end method

.method public b(Lcom/facebook/orca/notify/c;)V
    .locals 1

    .prologue
    .line 91
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/facebook/orca/notify/ak;->a(Z)V

    .line 92
    invoke-virtual {p1}, Lcom/facebook/orca/notify/c;->e()V

    .line 93
    return-void
.end method

.method public c(Lcom/facebook/orca/notify/c;)V
    .locals 1

    .prologue
    .line 96
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/facebook/orca/notify/ak;->a(Z)V

    .line 97
    invoke-virtual {p1}, Lcom/facebook/orca/notify/c;->e()V

    .line 98
    return-void
.end method
