.class public Lcom/google/android/gms/drive/MetadataChangeSet$Builder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/drive/MetadataChangeSet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private final HW:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

.field private HX:Lcom/google/android/gms/drive/metadata/internal/AppVisibleCustomProperties$a;

.field private final mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/drive/MetadataChangeSet$Builder;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->gF()Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/drive/MetadataChangeSet$Builder;->HW:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    iput-object p1, p0, Lcom/google/android/gms/drive/MetadataChangeSet$Builder;->mContext:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public build()Lcom/google/android/gms/drive/MetadataChangeSet;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/drive/MetadataChangeSet$Builder;->HX:Lcom/google/android/gms/drive/metadata/internal/AppVisibleCustomProperties$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/drive/MetadataChangeSet$Builder;->HW:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    sget-object v1, Lcom/google/android/gms/internal/iq;->JV:Lcom/google/android/gms/internal/iq$a;

    iget-object v2, p0, Lcom/google/android/gms/drive/MetadataChangeSet$Builder;->HX:Lcom/google/android/gms/drive/metadata/internal/AppVisibleCustomProperties$a;

    invoke-virtual {v2}, Lcom/google/android/gms/drive/metadata/internal/AppVisibleCustomProperties$a;->gD()Lcom/google/android/gms/drive/metadata/internal/AppVisibleCustomProperties;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->b(Lcom/google/android/gms/drive/metadata/MetadataField;Ljava/lang/Object;)V

    :cond_0
    new-instance v0, Lcom/google/android/gms/drive/MetadataChangeSet;

    iget-object v1, p0, Lcom/google/android/gms/drive/MetadataChangeSet$Builder;->HW:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    invoke-direct {v0, v1}, Lcom/google/android/gms/drive/MetadataChangeSet;-><init>(Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;)V

    return-object v0
.end method

.method public setDescription(Ljava/lang/String;)Lcom/google/android/gms/drive/MetadataChangeSet$Builder;
    .locals 2
    .param p1, "description"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/drive/MetadataChangeSet$Builder;->HW:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    sget-object v1, Lcom/google/android/gms/internal/iq;->JW:Lcom/google/android/gms/drive/metadata/MetadataField;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->b(Lcom/google/android/gms/drive/metadata/MetadataField;Ljava/lang/Object;)V

    return-object p0
.end method

.method public setIndexableText(Ljava/lang/String;)Lcom/google/android/gms/drive/MetadataChangeSet$Builder;
    .locals 2
    .param p1, "text"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/drive/MetadataChangeSet$Builder;->HW:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    sget-object v1, Lcom/google/android/gms/internal/iq;->Kb:Lcom/google/android/gms/drive/metadata/MetadataField;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->b(Lcom/google/android/gms/drive/metadata/MetadataField;Ljava/lang/Object;)V

    return-object p0
.end method

.method public setLastViewedByMeDate(Ljava/util/Date;)Lcom/google/android/gms/drive/MetadataChangeSet$Builder;
    .locals 2
    .param p1, "date"    # Ljava/util/Date;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/drive/MetadataChangeSet$Builder;->HW:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    sget-object v1, Lcom/google/android/gms/internal/is;->Kx:Lcom/google/android/gms/internal/is$b;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->b(Lcom/google/android/gms/drive/metadata/MetadataField;Ljava/lang/Object;)V

    return-object p0
.end method

.method public setMimeType(Ljava/lang/String;)Lcom/google/android/gms/drive/MetadataChangeSet$Builder;
    .locals 2
    .param p1, "mimeType"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/drive/MetadataChangeSet$Builder;->HW:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    sget-object v1, Lcom/google/android/gms/internal/iq;->Kk:Lcom/google/android/gms/internal/iq$c;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->b(Lcom/google/android/gms/drive/metadata/MetadataField;Ljava/lang/Object;)V

    return-object p0
.end method

.method public setPinned(Z)Lcom/google/android/gms/drive/MetadataChangeSet$Builder;
    .locals 3
    .param p1, "pinned"    # Z

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/drive/MetadataChangeSet$Builder;->HW:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    sget-object v1, Lcom/google/android/gms/internal/iq;->Kf:Lcom/google/android/gms/internal/iq$b;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->b(Lcom/google/android/gms/drive/metadata/MetadataField;Ljava/lang/Object;)V

    return-object p0
.end method

.method public setStarred(Z)Lcom/google/android/gms/drive/MetadataChangeSet$Builder;
    .locals 3
    .param p1, "starred"    # Z

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/drive/MetadataChangeSet$Builder;->HW:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    sget-object v1, Lcom/google/android/gms/internal/iq;->Kp:Lcom/google/android/gms/internal/iq$f;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->b(Lcom/google/android/gms/drive/metadata/MetadataField;Ljava/lang/Object;)V

    return-object p0
.end method

.method public setTitle(Ljava/lang/String;)Lcom/google/android/gms/drive/MetadataChangeSet$Builder;
    .locals 2
    .param p1, "title"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/drive/MetadataChangeSet$Builder;->HW:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    sget-object v1, Lcom/google/android/gms/internal/iq;->Kr:Lcom/google/android/gms/internal/iq$g;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->b(Lcom/google/android/gms/drive/metadata/MetadataField;Ljava/lang/Object;)V

    return-object p0
.end method

.method public setViewed(Z)Lcom/google/android/gms/drive/MetadataChangeSet$Builder;
    .locals 3
    .param p1, "viewed"    # Z

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/drive/MetadataChangeSet$Builder;->HW:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    sget-object v1, Lcom/google/android/gms/internal/iq;->Kj:Lcom/google/android/gms/drive/metadata/MetadataField;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->b(Lcom/google/android/gms/drive/metadata/MetadataField;Ljava/lang/Object;)V

    return-object p0
.end method
