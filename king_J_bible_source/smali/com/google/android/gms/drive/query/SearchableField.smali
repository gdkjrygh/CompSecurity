.class public Lcom/google/android/gms/drive/query/SearchableField;
.super Ljava/lang/Object;


# static fields
.field public static final GE:Lcom/google/android/gms/drive/metadata/SearchableOrderedMetadataField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/drive/metadata/SearchableOrderedMetadataField",
            "<",
            "Ljava/util/Date;",
            ">;"
        }
    .end annotation
.end field

.field public static final IS_PINNED:Lcom/google/android/gms/drive/metadata/SearchableMetadataField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/drive/metadata/SearchableMetadataField",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final LAST_VIEWED_BY_ME:Lcom/google/android/gms/drive/metadata/SearchableOrderedMetadataField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/drive/metadata/SearchableOrderedMetadataField",
            "<",
            "Ljava/util/Date;",
            ">;"
        }
    .end annotation
.end field

.field public static final MIME_TYPE:Lcom/google/android/gms/drive/metadata/SearchableMetadataField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/drive/metadata/SearchableMetadataField",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final MODIFIED_DATE:Lcom/google/android/gms/drive/metadata/SearchableOrderedMetadataField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/drive/metadata/SearchableOrderedMetadataField",
            "<",
            "Ljava/util/Date;",
            ">;"
        }
    .end annotation
.end field

.field public static final PARENTS:Lcom/google/android/gms/drive/metadata/SearchableCollectionMetadataField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/drive/metadata/SearchableCollectionMetadataField",
            "<",
            "Lcom/google/android/gms/drive/DriveId;",
            ">;"
        }
    .end annotation
.end field

.field public static final STARRED:Lcom/google/android/gms/drive/metadata/SearchableMetadataField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/drive/metadata/SearchableMetadataField",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final TITLE:Lcom/google/android/gms/drive/metadata/SearchableMetadataField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/drive/metadata/SearchableMetadataField",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final TRASHED:Lcom/google/android/gms/drive/metadata/SearchableMetadataField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/drive/metadata/SearchableMetadataField",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/gs;->Go:Lcom/google/android/gms/internal/gs$f;

    sput-object v0, Lcom/google/android/gms/drive/query/SearchableField;->TITLE:Lcom/google/android/gms/drive/metadata/SearchableMetadataField;

    sget-object v0, Lcom/google/android/gms/internal/gs;->Gh:Lcom/google/android/gms/internal/gs$b;

    sput-object v0, Lcom/google/android/gms/drive/query/SearchableField;->MIME_TYPE:Lcom/google/android/gms/drive/metadata/SearchableMetadataField;

    sget-object v0, Lcom/google/android/gms/internal/gs;->Gp:Lcom/google/android/gms/internal/gs$g;

    sput-object v0, Lcom/google/android/gms/drive/query/SearchableField;->TRASHED:Lcom/google/android/gms/drive/metadata/SearchableMetadataField;

    sget-object v0, Lcom/google/android/gms/internal/gs;->Gk:Lcom/google/android/gms/internal/gs$c;

    sput-object v0, Lcom/google/android/gms/drive/query/SearchableField;->PARENTS:Lcom/google/android/gms/drive/metadata/SearchableCollectionMetadataField;

    sget-object v0, Lcom/google/android/gms/internal/gt;->Gw:Lcom/google/android/gms/internal/gt$e;

    sput-object v0, Lcom/google/android/gms/drive/query/SearchableField;->GE:Lcom/google/android/gms/drive/metadata/SearchableOrderedMetadataField;

    sget-object v0, Lcom/google/android/gms/internal/gs;->Gm:Lcom/google/android/gms/internal/gs$e;

    sput-object v0, Lcom/google/android/gms/drive/query/SearchableField;->STARRED:Lcom/google/android/gms/drive/metadata/SearchableMetadataField;

    sget-object v0, Lcom/google/android/gms/internal/gt;->Gu:Lcom/google/android/gms/internal/gt$d;

    sput-object v0, Lcom/google/android/gms/drive/query/SearchableField;->MODIFIED_DATE:Lcom/google/android/gms/drive/metadata/SearchableOrderedMetadataField;

    sget-object v0, Lcom/google/android/gms/internal/gt;->Gt:Lcom/google/android/gms/internal/gt$b;

    sput-object v0, Lcom/google/android/gms/drive/query/SearchableField;->LAST_VIEWED_BY_ME:Lcom/google/android/gms/drive/metadata/SearchableOrderedMetadataField;

    sget-object v0, Lcom/google/android/gms/internal/gs;->Gc:Lcom/google/android/gms/internal/gs$a;

    sput-object v0, Lcom/google/android/gms/drive/query/SearchableField;->IS_PINNED:Lcom/google/android/gms/drive/metadata/SearchableMetadataField;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
